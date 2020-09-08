#!/bin/bash

echo "args $*"

if ! find $HOME/rundeck/packaging/build/distributions/ -name '*.rpm' ; then
	echo "rpm not found at $HOME/rundeck/packaging/build/distributions/rundeck*.rpm"
	exit 2
fi

yum install -y $HOME/rundeck/packaging/build/distributions/rundeck*.rpm 

service rundeckd start

exec "$@"
