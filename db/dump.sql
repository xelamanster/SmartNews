--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.4
-- Dumped by pg_dump version 9.4.4
-- Started on 2015-07-23 23:53:25

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 177 (class 3079 OID 11855)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2031 (class 0 OID 0)
-- Dependencies: 177
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_with_oids = false;

--
-- TOC entry 172 (class 1259 OID 16394)
-- Name: article; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE article (
    id bigint NOT NULL,
    "folderId" bigint,
    url character varying(4000),
    description character varying(4000)
);


--
-- TOC entry 173 (class 1259 OID 16400)
-- Name: article_tag; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE article_tag (
    "articleId" bigint NOT NULL,
    "tagId" bigint NOT NULL
);


--
-- TOC entry 174 (class 1259 OID 16403)
-- Name: client; Type: TABLE; Schema: public; Owner: -
--

CREATE SEQUENCE client_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

--
-- Name: client; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE client (
    id bigint DEFAULT nextval('client_seq'::regclass) NOT NULL,
    name character varying
);


--
-- TOC entry 175 (class 1259 OID 16409)
-- Name: folder; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE folder (
    id bigint NOT NULL,
    "parentId" bigint,
    "clientId" bigint,
    name character varying
);


--
-- TOC entry 176 (class 1259 OID 16415)
-- Name: tag; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE tag (
    id bigint NOT NULL,
    name character varying
);


--
-- TOC entry 1900 (class 2606 OID 16422)
-- Name: article_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY article
    ADD CONSTRAINT article_pkey PRIMARY KEY (id);


--
-- TOC entry 1902 (class 2606 OID 16424)
-- Name: article_tag_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY article_tag
    ADD CONSTRAINT article_tag_pkey PRIMARY KEY ("articleId", "tagId");


--
-- TOC entry 1906 (class 2606 OID 16426)
-- Name: folder_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY folder
    ADD CONSTRAINT folder_pkey PRIMARY KEY (id);


--
-- TOC entry 1908 (class 2606 OID 16428)
-- Name: tag_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY tag
    ADD CONSTRAINT tag_pkey PRIMARY KEY (id);


--
-- TOC entry 1904 (class 2606 OID 16430)
-- Name: users_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY client
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 1909 (class 2606 OID 16431)
-- Name: article_folderId_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY article
    ADD CONSTRAINT "article_folderId_fkey" FOREIGN KEY ("folderId") REFERENCES folder(id);


--
-- TOC entry 1910 (class 2606 OID 16436)
-- Name: article_tag_articleId_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY article_tag
    ADD CONSTRAINT "article_tag_articleId_fkey" FOREIGN KEY ("articleId") REFERENCES article(id);


--
-- TOC entry 1911 (class 2606 OID 16441)
-- Name: article_tag_tagId_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY article_tag
    ADD CONSTRAINT "article_tag_tagId_fkey" FOREIGN KEY ("tagId") REFERENCES tag(id);


--
-- TOC entry 1912 (class 2606 OID 16446)
-- Name: folder_parentId_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY folder
    ADD CONSTRAINT "folder_parentId_fkey" FOREIGN KEY ("parentId") REFERENCES folder(id);


--
-- TOC entry 1913 (class 2606 OID 16451)
-- Name: folder_parentId_fkey1; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY folder
    ADD CONSTRAINT "folder_parentId_fkey1" FOREIGN KEY ("parentId") REFERENCES folder(id);


--
-- TOC entry 1914 (class 2606 OID 16456)
-- Name: folder_userId_fkey; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY folder
    ADD CONSTRAINT "folder_userId_fkey" FOREIGN KEY ("clientId") REFERENCES client(id);


--
-- TOC entry 1915 (class 2606 OID 16461)
-- Name: folder_userId_fkey1; Type: FK CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY folder
    ADD CONSTRAINT "folder_userId_fkey1" FOREIGN KEY ("clientId") REFERENCES client(id);


-- Completed on 2015-07-23 23:53:25

--
-- PostgreSQL database dump complete
--

