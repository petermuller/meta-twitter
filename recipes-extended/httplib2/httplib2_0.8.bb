DESCRIPTION = "httplib2 support"
LICENSE = "Httplib2 Software License"
SECTION = "console/tools"
PR = "r0"

LIC_FILES_CHKSUM="file://README;beginline=98;md5=dcf4f2b7dde2b1d0dff097df209c9381"

SRC_URI="https://httplib2.googlecode.com/files/${P}.tar.gz"
SRC_URI[md5sum]="a143657998f6752be998e2ec740e7dec"
SRC_URI[sha512sum]="3b95b2f64f7b24a638792562e2d8645f9087ab716a105c8771e002507fde3cca9eb7e5de27140a7aed075e70ebd83fbfbda798714a94153b6233b2b704db1176"

DEPENDS = "python"
RDEPENDS = "python"

do_install() {
	python setup.py install
}
