Descrição
Uma operadora de telefonia móvel possui os registros de suas linhas telefônicas e o saldo
de créditos de cada linha, em seu servidor. Cada telefone se conecta a operadora através de
uma  conexão  
websocket
, informando  o  numero  da linha parametrizado  na sua URI. Como
por exemplo:
ws://operadora.com.br/operdora/{numero}
As linhas são cadastradas quando se conectam a primeira vez com o a operadora, com o
saldo zerado.
Uma linha é considerada fora de área ou desligada, caso o telefone exista no registro, mas
não está conectado com a operadora. Uma vez conectado, o telefone poderá:

Enviar   mensagem   SMS   para   um   numero   de   telefone   qualquer,  mas   com   as   seguintes
observações:
o
O envio de um SMS devera descontar R$0,50 do saldo do remetente. Caso a linha
não tenha saldo suficiente, a operadora deverá notificá-la.
o
O   SMS   devera   chegar   no   receptor   com   a   informação,   alem   da   mensagem,   do
numero do remetente.
o
Se o destinatário estiver fora de área/ desligado, ele poderá receber a mensagem
quando   estiver   conectado   a   operadora.   Assim   que   isso   acontecer,  a   operadora
deverá notificar ao remetente que a mensagem foi entregue e; a hora e data que
isso aconteceu. No caso do remetente estiver fora de área/desligado, ele recebera
a notificação quando se conectar a operadora.
o
Se o numero não existe, a operadora deverá notificar o remetente.

Enviar   uma   mensagem   a   operadora,   solicitando   creditar,  um   valor   informado,   ao   seu
saldo.

Enviar uma mensagem a operadora, solicitando consulta do saldo atual.
Implemente uma aplicação cliente* e servidora para o cenário descrito acima.
Equipe:
 máximo 2 alunos
Entrega/Defesa:
 20/12/2018
*
P
ode usar a extensão WebSocket Client do Chrome.
