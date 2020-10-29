
CREATE TABLE public.usuario (
                id SERIAL NOT NULL,
                nome VARCHAR(80),
                login VARCHAR(45),
                senha VARCHAR NOT NULL,
                registro_ativo boolean,
                CONSTRAINT id_12 PRIMARY KEY (id)
);


CREATE TABLE public.tipoproduto (
                id INTEGER NOT NULL,
                nome VARCHAR(45),
                registro_ativo SMALLINT,
                CONSTRAINT id_9 PRIMARY KEY (id)
);


CREATE TABLE public.produto (
                id INTEGER NOT NULL,
                tipoproduto_id INTEGER NOT NULL,
                nome VARCHAR(80),
                descricao VARCHAR(150),
                preco_unitario NUMERIC(14,2),
                unidade INTEGER NOT NULL,
                registro_ativo SMALLINT,
                data_registro TIMESTAMP WITHOUT TIME ZONE,
                CONSTRAINT id_7 PRIMARY KEY (id)
);


CREATE INDEX fk_produto_tipoproduto1_idx
 ON public.produto
 ( tipoproduto_id ASC );

CREATE TABLE public.permissao (
                id INTEGER NOT NULL,
                nome VARCHAR(100),
                CONSTRAINT id_4 PRIMARY KEY (id)
);


CREATE TABLE public.permissao_usuario (
                usuario_id INTEGER NOT NULL,
                permissao_id INTEGER NOT NULL,
                permitido SMALLINT NOT NULL,
                CONSTRAINT id_5 PRIMARY KEY (usuario_id, permissao_id)
);


CREATE INDEX fk_permissao_usuario_permissao_idx
 ON public.permissao_usuario
 ( permissao_id ASC );

CREATE INDEX fk_permissao_usuario_usuario1_idx
 ON public.permissao_usuario
 ( usuario_id ASC );

CREATE TABLE public.estado (
                id INTEGER NOT NULL,
                nome VARCHAR(80),
                sigla VARCHAR(2),
                CONSTRAINT id_2 PRIMARY KEY (id)
);


CREATE TABLE public.cidade (
                id INTEGER NOT NULL,
                nome VARCHAR(80),
                estado_id INTEGER NOT NULL,
                CONSTRAINT id_1 PRIMARY KEY (id)
);


CREATE INDEX fk_cidade_estado1_idx
 ON public.cidade
 ( estado_id ASC );

CREATE TABLE public.pontosvenda (
                id INTEGER NOT NULL,
                nome VARCHAR(80),
                endereco VARCHAR(100),
                numero INTEGER,
                bairro VARCHAR(45),
                cidade_id INTEGER NOT NULL,
                registro_ativo SMALLINT,
                CONSTRAINT id_6 PRIMARY KEY (id)
);


CREATE INDEX fk_pontosvenda_cidade1_idx
 ON public.pontosvenda
 ( cidade_id ASC );

CREATE TABLE public.grupo (
                id INTEGER NOT NULL,
                nome VARCHAR(80),
                endereco VARCHAR(100),
                numero INTEGER,
                bairro VARCHAR(45),
                cidade_id INTEGER NOT NULL,
                cnpj VARCHAR(14),
                inscricao_estadual VARCHAR(20),
                distribuidor_produtos SMALLINT,
                registro_ativo SMALLINT,
                CONSTRAINT id_3 PRIMARY KEY (id)
);


CREATE INDEX fk_grupo_cidade1_idx
 ON public.grupo
 ( cidade_id ASC );

CREATE TABLE public.certificadora (
                id INTEGER NOT NULL,
                nome VARCHAR(80),
                registro_ativo SMALLINT,
                CONSTRAINT id_11 PRIMARY KEY (id)
);


CREATE TABLE public.produtor (
                id INTEGER NOT NULL,
                certificadora_id INTEGER NOT NULL,
                grupo_id INTEGER NOT NULL,
                cidade_id INTEGER NOT NULL,
                nome VARCHAR(80),
                nome_propriedade VARCHAR(80),
                cpf_cnpj VARCHAR(14),
                numero INTEGER,
                telefone VARCHAR(20),
                endereco VARCHAR(100),
                bairro VARCHAR(45),
                latitude NUMERIC(14,7),
                longitude NUMERIC(14,7),
                certificacao_organicos VARCHAR(1),
                venda_consumidorfinal SMALLINT,
                registro_ativo SMALLINT,
                CONSTRAINT id_10 PRIMARY KEY (id)
);


CREATE INDEX fk_produtor_certificadora1_idx
 ON public.produtor
 ( certificadora_id ASC );

CREATE INDEX fk_produtor_cidade1_idx
 ON public.produtor
 ( cidade_id ASC );

CREATE INDEX fk_produtor_grupo1_idx
 ON public.produtor
 ( grupo_id ASC );

CREATE TABLE public.produtor_produto (
                id INTEGER NOT NULL,
                produtor_id INTEGER NOT NULL,
                produto_id INTEGER NOT NULL,
                pontosvenda_id INTEGER NOT NULL,
                dia_semana INTEGER,
                horario TIME,
                pausado SMALLINT NOT NULL,
                CONSTRAINT id_8 PRIMARY KEY (id)
);


CREATE INDEX fk_produtor_produto_pontosvenda1_idx
 ON public.produtor_produto
 ( pontosvenda_id ASC );

CREATE INDEX fk_produtor_produto_produto1_idx
 ON public.produtor_produto
 ( produto_id ASC );

CREATE INDEX fk_produtor_produto_produtor1_idx
 ON public.produtor_produto
 ( produtor_id ASC );

ALTER TABLE public.permissao_usuario ADD CONSTRAINT fk_permissao_usuario_usuario1
FOREIGN KEY (usuario_id)
REFERENCES public.usuario (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.produto ADD CONSTRAINT fk_produto_tipoproduto1
FOREIGN KEY (tipoproduto_id)
REFERENCES public.tipoproduto (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.produtor_produto ADD CONSTRAINT fk_produtor_produto_produto1
FOREIGN KEY (produto_id)
REFERENCES public.produto (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.permissao_usuario ADD CONSTRAINT fk_permissao_usuario_permissao
FOREIGN KEY (permissao_id)
REFERENCES public.permissao (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.cidade ADD CONSTRAINT fk_cidade_estado1
FOREIGN KEY (estado_id)
REFERENCES public.estado (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.grupo ADD CONSTRAINT fk_grupo_cidade1
FOREIGN KEY (cidade_id)
REFERENCES public.cidade (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.pontosvenda ADD CONSTRAINT fk_pontosvenda_cidade1
FOREIGN KEY (cidade_id)
REFERENCES public.cidade (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.produtor ADD CONSTRAINT fk_produtor_cidade1
FOREIGN KEY (cidade_id)
REFERENCES public.cidade (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.produtor_produto ADD CONSTRAINT fk_produtor_produto_pontosvenda1
FOREIGN KEY (pontosvenda_id)
REFERENCES public.pontosvenda (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.produtor ADD CONSTRAINT fk_produtor_grupo1
FOREIGN KEY (grupo_id)
REFERENCES public.grupo (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.produtor ADD CONSTRAINT fk_produtor_certificadora1
FOREIGN KEY (certificadora_id)
REFERENCES public.certificadora (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.produtor_produto ADD CONSTRAINT fk_produtor_produto_produtor1
FOREIGN KEY (produtor_id)
REFERENCES public.produtor (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
