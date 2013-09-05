DESCRIPTION = "simplejson support"
LICENSE = "MIT"
SECTION = "console/tools"
PR = "r3"

LIC_FILES_CHKSUM="file://LICENSE.txt;md5=c6338d7abd321c0b50a2a547e441c52e"

SRC_URI="https://pypi.python.org/packages/source/s/simplejson/${P}.tar.gz"
SRC_URI[md5sum]="0e29b393bceac8081fa4e93ff9f6a001"
SRC_URI[sha256sum]="7a8a6bd82e111976aeb06138316ab10847adf612925072eaff8512228bcf9a1f"

DEPENDS = "python"
RDEPENDS_${PN} += "python python-numbers"

PACKAGES = " \
	${PN} \
	"

FILES_${PN} = " \
	/usr \
	/usr/lib \
	/usr/lib/python2.7 \
	/usr/lib/python2.7/site-packages \
	/usr/lib/python2.7/site-packages/simplejson-3.3.0-py2.7.egg-info \
	/usr/lib/python2.7/site-packages/simplejson \
	/usr/lib/python2.7/site-packages/simplejson/compat.py \
	/usr/lib/python2.7/site-packages/simplejson/ordered_dict.py \
	/usr/lib/python2.7/site-packages/simplejson/decoder.pyc \
	/usr/lib/python2.7/site-packages/simplejson/encoder.pyc \
	/usr/lib/python2.7/site-packages/simplejson/scanner.pyc \
	/usr/lib/python2.7/site-packages/simplejson/encoder.py \
	/usr/lib/python2.7/site-packages/simplejson/__init__.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tool.py \
	/usr/lib/python2.7/site-packages/simplejson/compat.pyc \
	/usr/lib/python2.7/site-packages/simplejson/__init__.py \
	/usr/lib/python2.7/site-packages/simplejson/decoder.py \
	/usr/lib/python2.7/site-packages/simplejson/tool.pyc \
	/usr/lib/python2.7/site-packages/simplejson/scanner.py \
	/usr/lib/python2.7/site-packages/simplejson/ordered_dict.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_pass1.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_fail.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_recursion.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_check_circular.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_dump.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_namedtuple.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_tool.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_pass2.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_fail.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_scanstring.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_tool.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_speedups.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_item_sort_key.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_pass3.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_errors.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_tuple.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_encode_for_html.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_bigint_as_string.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_decimal.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_float.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_default.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_unicode.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_decimal.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_encode_for_html.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_tuple.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_separators.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_default.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_for_json.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_speedups.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_decode.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_decode.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_bigint_as_string.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_errors.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_encode_basestring_ascii.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_for_json.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_recursion.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_pass2.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/__init__.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_check_circular.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_dump.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_pass1.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_indent.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_item_sort_key.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_namedtuple.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_indent.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_pass3.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/__init__.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_encode_basestring_ascii.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_scanstring.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_unicode.pyc \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_float.py \
	/usr/lib/python2.7/site-packages/simplejson/tests/test_separators.pyc \
	"

do_install() {
	install -m 0755 -d ${D}/usr
	python setup.py install --prefix=${D}/usr
}
