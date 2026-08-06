package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import com.intercom.twig.BuildConfig;
import defpackage.g2b;
import defpackage.o7a;
import defpackage.oj8;
import defpackage.r02;
import defpackage.ss5;
import defpackage.t78;
import defpackage.x27;
import defpackage.ze2;
import io.intercom.android.sdk.utilities.PreferenceKeys;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ShutdownStore$Companion$createSharedPrefsMigration$1 implements ze2<t78> {
    private final ss5 oldPrefs$delegate;

    public ShutdownStore$Companion$createSharedPrefsMigration$1(Context context) {
        this.oldPrefs$delegate = new o7a(new oj8(1, context));
    }

    private final SharedPreferences getOldPrefs() {
        return (SharedPreferences) this.oldPrefs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences oldPrefs_delegate$lambda$0(Context context) {
        return context.getSharedPreferences(PreferenceKeys.INTERCOM_SHUTDOWN_PREFS, 0);
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
        String string = oldPrefs.getString("ShutdownFingerprint", BuildConfig.FLAVOR);
        if (string == null) {
            string = BuildConfig.FLAVOR;
        }
        if (string.length() > 0) {
            x27VarC.g(ShutdownStore.KEY_SHUTDOWN_FINGERPRINT, string);
        }
        long j = getOldPrefs().getLong("ShutdownExpiry", 0L);
        if (j != 0) {
            x27VarC.g(ShutdownStore.KEY_SHUTDOWN_EXPIRY, new Long(j));
        }
        String string2 = getOldPrefs().getString("ShutdownReason", BuildConfig.FLAVOR);
        if (string2 != null) {
            str = string2;
        }
        if (str.length() > 0) {
            x27VarC.g(ShutdownStore.KEY_SHUTDOWN_REASON, str);
        }
        return x27VarC.d();
    }

    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(t78 t78Var, r02<? super Boolean> r02Var) {
        boolean z = false;
        boolean z2 = t78Var.b(ShutdownStore.KEY_SHUTDOWN_FINGERPRINT) == null && t78Var.b(ShutdownStore.KEY_SHUTDOWN_EXPIRY) == null && t78Var.b(ShutdownStore.KEY_SHUTDOWN_REASON) == null;
        boolean z3 = getOldPrefs().contains("ShutdownFingerprint") || getOldPrefs().contains("ShutdownExpiry") || getOldPrefs().contains("ShutdownReason");
        if (z2 && z3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ze2
    public /* bridge */ /* synthetic */ Object shouldMigrate(t78 t78Var, r02 r02Var) {
        return shouldMigrate2(t78Var, (r02<? super Boolean>) r02Var);
    }
}
