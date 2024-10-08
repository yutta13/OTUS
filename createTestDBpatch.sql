-- Table: public.test

-- DROP TABLE IF EXISTS public.test;

CREATE TABLE IF NOT EXISTS public.test
(
    test_id numeric(999,0) NOT NULL,
    test_name character varying(256) COLLATE pg_catalog."default" NOT NULL,
    descx character varying(999) COLLATE pg_catalog."default",
    CONSTRAINT test_pkey PRIMARY KEY (test_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.test
    OWNER to postgres;	

##
-- Table: public.questions

-- DROP TABLE IF EXISTS public.questions;

CREATE TABLE IF NOT EXISTS public.questions
(
    question_id numeric(999,0) NOT NULL,
    test_id numeric(999,0) NOT NULL,
    question character varying(40) COLLATE pg_catalog."default",
    CONSTRAINT questions_pkey PRIMARY KEY (question_id),
    CONSTRAINT questions_test_id_fkey FOREIGN KEY (test_id)
        REFERENCES public.test (test_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.questions
    OWNER to postgres;



-- Table: public.answers

-- DROP TABLE IF EXISTS public.answers;

CREATE TABLE IF NOT EXISTS public.answers
(
    answer_id numeric(999,0) NOT NULL,
    question_id numeric(999,0) NOT NULL,
    answer_text character varying(40) COLLATE pg_catalog."default",
    is_correct numeric(1,0) NOT NULL,
    CONSTRAINT answers_pkey PRIMARY KEY (answer_id),
    CONSTRAINT answers_question_id_fkey FOREIGN KEY (question_id)
        REFERENCES public.questions (question_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.answers
    OWNER to postgres;
	

