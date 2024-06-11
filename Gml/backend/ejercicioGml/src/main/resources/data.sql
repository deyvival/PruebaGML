CREATE TABLE cliente (
  id          INTEGER PRIMARY KEY,
  documentClient  VARCHAR(64) NOT NULL,
  nameClient  VARCHAR(64) NOT NULL,
  telClient VARCHAR(10) NOT NULL,
  mailClient   VARCHAR(40) NOT NULL);
  
  
insert into cliente (id, documentClient, nameClient, telClient, mailClient) values(1, '56789', 'pp gg', '358789', 'prg@mailito.co');

