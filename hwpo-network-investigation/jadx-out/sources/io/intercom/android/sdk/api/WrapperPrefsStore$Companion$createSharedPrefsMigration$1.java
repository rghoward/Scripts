package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import com.intercom.twig.BuildConfig;
import defpackage.g2b;
import defpackage.o7a;
import defpackage.r02;
import defpackage.ss5;
import defpackage.t78;
import defpackage.x27;
import defpackage.yb5;
import defpackage.ze2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class WrapperPrefsStore$Companion$createSharedPrefsMigration$1 implements ze2<t78> {
    private final ss5 oldPrefs$delegate;

    public WrapperPrefsStore$Companion$createSharedPrefsMigration$1(Context context) {
        this.oldPrefs$delegate = new o7a(new yb5(3, context));
    }

    private final SharedPreferences getOldPrefs() {
        return (SharedPreferences) this.oldPrefs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences oldPrefs_delegate$lambda$0(Context context) {
        return context.getSharedPreferences("intercomsdk_wrapper_prefs", 0);
    }

    @Override // defpackage.ze2
    public Object cleanUp(r02<? super g2b> r02Var) {
        getOldPrefs().edit().clear().apply();
        return g2b.a;
    }

    @Override // defpackage.ze2
    public Object migrate(t78 t78Var, r02<? super t78> r02Var) {
        x27 x27VarC = t78Var.c();
        SharedPreferences oldPrefs = getOldPrefs();
        String str = BuildConfig.FLAVOR;
        String string = oldPrefs.getString("cordova_version", BuildConfig.FLAVOR);
        if (string == null) {
            string = BuildConfig.FLAVOR;
        }
        if (string.length() > 0) {
            x27VarC.g(WrapperPrefsStore.KEY_CORDOVA_VERSION, string);
        }
        String string2 = getOldPrefs().getString("react_native_version", BuildConfig.FLAVOR);
        if (string2 != null) {
            str = string2;
        }
        if (str.length() > 0) {
            x27VarC.g(WrapperPrefsStore.KEY_REACT_NATIVE_VERSION, str);
        }
        return x27VarC.d();
    }

    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(t78 t78Var, r02<? super Boolean> r02Var) {
        return Boolean.valueOf(t78Var.b(WrapperPrefsStore.KEY_CORDOVA_VERSION) == null && t78Var.b(WrapperPrefsStore.KEY_REACT_NATIVE_VERSION) == null && (getOldPrefs().contains("cordova_version") || getOldPrefs().contains("react_native_version")));
    }

    @Override // defpackage.ze2
    public /* bridge */ /* synthetic */ Object shouldMigrate(t78 t78Var, r02 r02Var) {
        return shouldMigrate2(t78Var, (r02<? super Boolean>) r02Var);
    }
}
