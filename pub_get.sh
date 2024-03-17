#! /usr/bin/env bash

set -e

(cd dev_packages/flutter_inappwebview_internal_annotations && dart pub get)
(cd dev_packages/generators && flutter pub get)
(cd flutter_inappwebview_platform_interface && flutter pub get)
(cd flutter_inappwebview_web && flutter pub get)
(cd flutter_inappwebview_macos && flutter pub get)
(cd flutter_inappwebview_android && flutter pub get)
(cd flutter_inappwebview_ios && flutter pub get)
(cd flutter_inappwebview && flutter pub get)
(cd flutter_inappwebview/example && flutter pub get)
