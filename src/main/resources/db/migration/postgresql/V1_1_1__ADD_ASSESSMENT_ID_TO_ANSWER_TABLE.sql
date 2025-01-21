alter table if exists answer add column assessment_id integer;
alter table if exists answer add constraint FK43trb1qe9ybh2a3yt017fn415 foreign key (assessment_id) references assessment;
