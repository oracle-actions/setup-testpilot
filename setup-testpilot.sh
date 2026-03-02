#!/bin/bash

set -e

if [ ! -f "${GITHUB_ACTION_PATH}"/setup-testpilot ]; then

echo "::group::🔽 Downloading setup-testpilot"
wget https://github.com/oracle-actions/setup-testpilot/releases/download/${VERSION}/setup-testpilot-linux-x86_64.tar.gz -O ${GITHUB_ACTION_PATH}/setup-testpilot-linux-x86_64.tar.gz -q
echo "::endgroup::"

echo "::group::📦 Unpacking setup-testpilot"
tar -xf ${GITHUB_ACTION_PATH}/setup-testpilot-linux-x86_64.tar.gz -C ${GITHUB_ACTION_PATH}/ --overwrite
echo "::endgroup::"

fi;
