create table fw_allowed_domain
(
  org_id    bigint not null,
  domain_id bigint not null,
  primary key (org_id, domain_id)
)
