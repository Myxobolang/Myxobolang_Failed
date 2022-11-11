%option noyywrap

%{
int a = 0;
%}

%%
[a-z]+ { printf("%s ", yytext); }
\n { a++; }
. {;}
%%

int main()
{
    yylex();
    printf("\n%d\n", a);
    return 0;
}