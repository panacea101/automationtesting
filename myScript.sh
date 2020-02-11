!/usr/bin/env bash

mkdir myFiles

for i in {0..006}
do
    echo hello > "myFiles/file${i}.txt"
done
. ./myFiles
ls -tp | grep -v '/$' | tail -n +4 | tr '\n' '\0' | xargs -0 rm --
