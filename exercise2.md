| **Command** | Function | Parameters | Affected Files | Local/Remote Changes |
|-------------|----------|------------|----------------|---------------------|
| git config | used to edit/create values for the git configuration files to use, on either a global or local level i.e. in the repo’s .git folder | user.email & user.name (many more) | .gitconfig file | can be changed to local or global |
| git init | creates a new git repository | can take the [directory] parameter, which transforms the entered directory into a git directory | .git subdirectory (metadata) | where the git init was executed |
| git commit | commits all staged changes, “makes it ready to ship to git” | [-a] commits all changed files, regardless if they are staged or not<br> [-m] allows to enter a commit message<br> [-amend] allows to modify last commit | any files found in staged changes | local repository |
| git status | displays the state of the working directory and staging area | no known parameters | no files | no changes |
| git add | moves (selected) files to staging area | [.] adds all files<br> [filename] selected file | could be any files | staging area |
| git log | shows history of commits (staged snapshots) | [-n limit] limits number of commits<br> [file] shows history of commits of a specified file | could be any files | no changes |
| git diff | shows differences between working directory and staging area | [file] shows differences of a certain file<br> [--staged file] shows changes made to a file that is already in staging area | could be any files | no changes |
| git pull | gets actual files from main on remote repository and merges into a local commit | [remote] specified remote repository | any file from remote repository | local working directory (changes, additions are received from server) i.e. new version |
| git push | uploads content of local repository to remote repository | [remote] [branch] | commits | remote repository |
