Inicialmente, é importante determinar as funcionalidades mínimas que o software deve contemplar:

1) Um componente capaz de ler arquivos CSV (linhas e colunas populadas de dados) e extrair os dados
2) Um método para obter e retornar a soma de cada linha do arquivo original
3) Um componente capaz de criar um novo arquivo CSV
4) Um método para escrever / popular o novo arquivo CSV gerado
5) Um controlador para orientar o fluxo de execução do programa, responsável por chamar os componentes e métodos, transmitir dados e encerrar a execução

Diante dessas informações, este seria o fluxo de Execução esperado:

1) O usuário fornece como entrada um arquivo CSV compatível
2) O componente leitor do arquivo é chamado e realiza o carregamento das linhas e colunas
3) É gerado um novo arquivo CSV semelhante ao original, porém com uma célula extra em cada linha, formando uma nova coluna
4) Para cada linha, é chamado o método para obter e retornar a soma das células da linha atual
5) O software deve escrever o valor retornardo na célula correspondente da coluna no novo arquivo CSV
6) O fluxo retorna para o ponto "4" até que a coluna seja totalmente preenchida
7) O software retorna o novo arquivo CSV contendo todas as linhas do CSV original e a coluna extra devidamente populadas
