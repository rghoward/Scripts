package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.g2b;
import defpackage.o7a;
import defpackage.r02;
import defpackage.ss5;
import defpackage.t78;
import defpackage.um2;
import defpackage.x27;
import defpackage.ze2;
import io.intercom.android.sdk.utilities.CryptoHelper;
import io.intercom.android.sdk.utilities.PreferenceKeys;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DeDuperStore$Companion$createSharedPrefsMigration$1 implements ze2<t78> {
    private final ss5 oldPrefs$delegate;

    public DeDuperStore$Companion$createSharedPrefsMigration$1(Context context) {
        this.oldPrefs$delegate = new o7a(new um2(context, 0));
    }

    private final SharedPreferences getOldPrefs() {
        return (SharedPreferences) this.oldPrefs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences oldPrefs_delegate$lambda$0(Context context) {
        return context.getSharedPreferences(PreferenceKeys.INTERCOM_DEDUPER_PREFS, 0);
    }

    @Override // defpackage.ze2
    public Object cleanUp(r02<? super g2b> r02Var) {
        getOldPrefs().edit().clear().apply();
        return g2b.a;
    }

    @Override // defpackage.ze2
    public Object migrate(t78 t78Var, r02<? super t78> r02Var) {
        x27 x27VarC = t78Var.c();
        String string = getOldPrefs().getString("CachedAttributes", "{}");
        if (string == null) {
            string = "{}";
        }
        if (!string.equals("{}")) {
            x27VarC.g(DeDuperStore.KEY_CACHED_ATTRIBUTES, CryptoHelper.INSTANCE.encrypt$intercom_sdk_base_release(string));
        }
        long j = getOldPrefs().getLong("EarliestUpdateAt", 0L);
        if (j != 0) {
            x27VarC.g(DeDuperStore.KEY_EARLIEST_UPDATE_AT, CryptoHelper.INSTANCE.encrypt$intercom_sdk_base_release(String.valueOf(j)));
        }
        return x27VarC.d();
    }

    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(t78 t78Var, r02<? super Boolean> r02Var) {
        boolean z = false;
        boolean z2 = t78Var.b(DeDuperStore.KEY_CACHED_ATTRIBUTES) == null && t78Var.b(DeDuperStore.KEY_EARLIEST_UPDATE_AT) == null;
        boolean z3 = getOldPrefs().contains("CachedAttributes") || getOldPrefs().contains("EarliestUpdateAt");
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
