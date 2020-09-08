# Yum install in docker

Oracle Linux 7:

You can use this to test install of a locally build .rpms for rundeck.

From the root checkout dir for the rundeck source repo use
`-v $PWD:/home/rundeck/rundeck` to mount the rundeck source volume.

## create image

	docker build --rm -t local/ol7 docker/ol7
	docker build docker/yuminstall-ol7

copy image id e.g. `53c9cb76cbe1`

## run to install rpms

	docker run -it -v $PWD:/home/rundeck/rundeck $IMG bash
