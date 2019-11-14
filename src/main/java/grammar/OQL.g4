grammar OQL;

a: (MUL | DIV | ADD | SUB | ID | INT | SELECT | NEWLINE| WS)*;
getDocument: (COLLECTION'.'DOCUMENT | DOCUMENT)*;
query: SELECT (VALUES FROM (getDocument | COLLECTION) | VALUES FROM (getDocument | COLLECTION)  WHERE CONDITION)*;

MUL: '*' {System.out.println("<" + this.getText() + ", *>");};
DIV: '/' {System.out.println("<" + this.getText() + ", />");};
ADD: '*' {System.out.println("<" + this.getText() + ", +>");};
SUB: '*' {System.out.println("<" + this.getText() + ", ->");};
SELECT: 'select' {System.out.println("<" + this.getText() + ", SELECT>");};
FROM: 'from' {System.out.println("<" + this.getText() + ", FROM>");};
WHERE: 'where' {System.out.println("<" + this.getText() + ", WHERE>");};
UPDATE: 'update' {System.out.println("<" + this.getText() + ", UPDATE>");};
DELETE: 'delete' {System.out.println("<" + this.getText() + ", DELETE>");};
CREATE: 'create' {System.out.println("<" + this.getText() + ", CREATE>");};
VALUES: 'values' {System.out.println("<" + this.getText() + ", VALUES>");};
DOCUMENT: 'document' {System.out.println("<" + this.getText() + ", DOCUMENT>");};
COLLECTION: 'collection' {System.out.println("<" + this.getText() + ", COLLECTION>");};

CONDITION: 'condition' {System.out.println("<" + this.getText() + ", CONDITION>");};
ID: [a-zA-Z]+ {System.out.println("<" + this.getText() + ", ID>");};
INT: [0-9]+ {System.out.println("<" + this.getText() + ", INT>");};
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;