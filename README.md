**Engenharia Redes e Sistemas de Computadores
Programação 2
Trabalho Prático
Ano letivo de 2024/2025
Gestão de Mercadorias em Armazéns
Objetivo
Este trabalho tem como principal objetivo implementar na linguagem Java uma aplicação de
simulação armazenamento de mercadorias em armazéns.
Descrição:
Desenvolver um simulador de rede de dispositivos IoT (Internet das Coisas) para gestão de
armazéns e monitorização das mercadorias neles armazenadas. Isso pode incluir sensores,
atuadores, e dispositivos inteligentes que se comunicam entre si.
Cada mercadoria é identificada por uma tag IoT que permite identificar a sua localização.
Sempre que uma mercadoria é mudada de local dentro do armazém ou sai do armazém para
um meio de transporte externo, o sistema terá capacidade de detetar e atualizar a localização
da mercadoria.
As mercadorias tem associadas um identificador único, uma descrição, um tipo, um peso, um
volume e a tag IoT. As mercadorias podem ser normais, frágeis, perecíveis, devendo ser tratadas
de forma diferente. Por exemplo, uma mercadoria frágil não deve ser movimentada
internamente num armazém juntamente com outras mercadorias e deve ser movimentada para
fora do armazém em meio de transporte especial. Por outro lado, uma mercadoria perecível
deve ter em consideração eventuais datas de validade para que mercadorias perecíveis do
mesmo tipo sejam escoadas do armazém por ordem dessa data, evitando assim que as mesmas
fiquem estragadas. Nesse caso até devem ser movimentadas para um armazém de reciclagem
por transporte especial.
Os armazéns têm um nome, uma morada, as dimensões (espaço útil de armazenamento).
Qualquer armazém pode receber ou expedir mercadorias, exceto os armazéns de reciclagem
que apenas recebem mercadorias.
Os meios de transporte de mercadorias podem ser internos a um armazém (ex. empilhadores)
ou externos (ex. camiões). Esse meio de transporte tem um identificador, bem como uma
capacidade de transporte limitada por peso e volume. O transporte de uma mercadoria para um
armazém de reciclagem apenas pode ser efetuado por um transporte especial.
A aplicação deverá permitir criar armazéns; meios de transporte (internos ou externos);
mercadorias e registar as mercadorias nos armazéns. Deve igualmente criar tags IoT e associálas às mercadorias.
Sempre que uma mercadoria é registada num armazém será necessário controlar se este tem
espaço suficiente para a armazenar. Sempre que é movimentada uma mercadoria por um meio
de transporte, seja interno ou externo ao armazém, será necessário controlar se o meio de
transporte tem capacidade para transportar e se está habilitado para esse transporte.
Relativamente às mercadorias, a sua movimentação é controlada pelas tags IoT sendo possível
consultar as mercadorias por tag, localização e estado. A saída e entrada de mercadorias, seja
nos armazéns, seja nos meios de transporte, deve ser detetada automaticamente, igualmente
pelas tags IoT.
A aplicação deve garantir a persistência dos dados relevantes à mesma em ficheiro. Deve
igualmente produzir relatórios em ficheiro de texto que permitam listar as mercadorias atuais
de um determinado armazém ou meio de transporte. Deve ainda produzir relatórios de
rastreabilidade de uma mercadoria, podendo assim saber-se os armazéns e os camiões por onde
determinada mercadoria passou.
Normas
O presente trabalho prático deverá ser desenvolvido em grupo, constituído por três alunos no
máximo. A constituição do grupo deve ser comunicada aos docentes das aulas práticas da
unidade curricular.
O desenvolvimento deve passar por duas fases, com a correspondente entrega no moodle:
- Fase 1: recorrendo a um Large Language Model (LLM), tipo ChatGPT, Copilot ou outro, o grupo
deverá solicitar apoio no desenvolvimento do trabalho prático. O processo de ajuda deve ser
documentado (ex. questões colocadas e sua cronologia, resultados obtidos, etc). O resultado
deve ser objeto de reflexão do grupo de forma a aproveitar ou descartar partes da ajuda obtida
para o desenvolvimento do trabalho prático. O relatório da Fase 1 e respetivos ficheiros anexos
deve ser colocado numa pasta compactada em formato ZIP ou RAR para ser submetida por um
dos elementos do grupo na página da unidade curricular na plataforma Moodle, até às 23:59
horas dos dias 22 de dezembro de 2024;
- Fase 2: Adaptação do resultado obtido na Fase 1 por forma a satisfazer os requisitos do
enunciado do trabalho prático. No grupo deve igualmente elaborar um relatório curto (máx. 2
páginas A4) onde devem apresentar a abordagem ao problema; as dificuldades sentidas durante
o desenvolvimento do projeto; bem como realizarem a autoavaliação do projeto e de cada um
dos elementos do grupo, individualmente.
Todo o material envolvido na solução proposta para o trabalho (projeto e outro material auxiliar)
resultante da Fase 2 deve ser colocado numa pasta compactada em formato ZIP ou RAR para
ser submetida por um dos elementos do grupo na página da unidade curricular na plataforma
Moodle, impreterivelmente até às 23:59 horas dos dias 13 de janeiro de 2025. A apresentação
dos projetos decorrerá nas aulas práticas dessa semana.
**