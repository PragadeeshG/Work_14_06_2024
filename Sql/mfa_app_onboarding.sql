create table if not exists mfa_app_onboarding(
integrated_app_id Integer not null,
sso_integrated_app1 varchar(255) null,
sso_value1 varchar(255) null,
sso_integrated_app2 varchar(255) null,
sso_value2 varchar(255) null,
sso_integrated_app3 varchar(255) null,
sso_value3 varchar(255) null,
sso_system varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint mfa_app_onboarding_pk primary key(integrated_app_id));