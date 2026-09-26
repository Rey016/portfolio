Cloud Security with AWS IAM

Used AWS IAM to control access to AWS resources by creating IAM policies, users, and groups, and testing permissions against EC2 instances.

AWS Services

- Amazon EC2
- AWS IAM

## Key Concepts

- IAM Policies
- IAM Users
- IAM User Groups
- EC2 Tags
- Permissions
- Effect, Action, and Resource
- IAM Policy Simulator
- Account Aliases

The project used EC2 tags to distinguish development and production environments. An IAM policy was created to allow EC2 actions on instances tagged with `Env=development` while preventing access to the production environment.

I tested the policy by attempting to stop both instances and verified the result using the IAM Policy Simulator.
