package io.intercom.android.sdk.api;

import android.content.Context;
import com.intercom.twig.BuildConfig;
import defpackage.xj5;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PlatformIdentifierUtilKt {
    public static final String ANDROID_HEADER = "intercom-android-sdk";
    public static final String CORDOVA_HEADER = "intercom-sdk-cordova";
    public static final String FLUTTER_HEADER = "intercom-sdk-flutter";
    public static final String NATIVE_SDK = "intercom-sdk-native";
    public static final String REACT_NATIVE_HEADER = "intercom-sdk-react-native";

    private static final Platform getPlatform(Context context) throws Throwable {
        String cordovaVersion = WrapperPrefsStore.Companion.create(context).getCordovaVersion();
        String str = isReactNativeApp() ? REACT_NATIVE_HEADER : BuildConfig.FLAVOR;
        String str2 = isFlutterApp() ? FLUTTER_HEADER : BuildConfig.FLAVOR;
        if (!xj5.a(cordovaVersion, BuildConfig.FLAVOR)) {
            return Platform.Cordova;
        }
        if (str.equals(BuildConfig.FLAVOR)) {
            return !str2.equals(BuildConfig.FLAVOR) ? Platform.Flutter : Platform.Native;
        }
        return Platform.ReactNative;
    }

    public static final String getPlatformIdentifier(Context context) {
        context.getClass();
        return getPlatform(context).getIdentifier();
    }

    private static final boolean isFlutterApp() {
        try {
            Class.forName("io.maido.intercom.IntercomFlutterPlugin");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final boolean isReactNativeApp() {
        try {
            Class.forName("com.intercom.reactnative.IntercomModule");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
