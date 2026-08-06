package io.intercom.android.sdk.identity;

import android.content.Context;
import android.content.SharedPreferences;
import com.intercom.twig.BuildConfig;
import defpackage.g2b;
import defpackage.o10;
import defpackage.o7a;
import defpackage.r02;
import defpackage.ss5;
import defpackage.t78;
import defpackage.x27;
import defpackage.ze2;
import io.intercom.android.sdk.utilities.CryptoHelper;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppIdentityStore$Companion$createSharedPrefsMigration$1 implements ze2<t78> {
    private final ss5 oldPrefs$delegate;

    public AppIdentityStore$Companion$createSharedPrefsMigration$1(Context context) {
        this.oldPrefs$delegate = new o7a(new o10(0, context));
    }

    private final SharedPreferences getOldPrefs() {
        return (SharedPreferences) this.oldPrefs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences oldPrefs_delegate$lambda$0(Context context) {
        return context.getSharedPreferences(PreferenceKeys.INTERCOM_PREFS, 0);
    }

    @Override // defpackage.ze2
    public Object cleanUp(r02<? super g2b> r02Var) {
        SharedPreferences.Editor editorEdit = getOldPrefs().edit();
        Iterator it = AppIdentityStore.MIGRATION_KEY_MAP.keySet().iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
        return g2b.a;
    }

    @Override // defpackage.ze2
    public Object migrate(t78 t78Var, r02<? super t78> r02Var) {
        x27 x27VarC = t78Var.c();
        for (Map.Entry entry : AppIdentityStore.MIGRATION_KEY_MAP.entrySet()) {
            String str = (String) entry.getKey();
            t78.a aVar = (t78.a) entry.getValue();
            SharedPreferences oldPrefs = getOldPrefs();
            String str2 = BuildConfig.FLAVOR;
            String string = oldPrefs.getString(str, BuildConfig.FLAVOR);
            if (string != null) {
                str2 = string;
            }
            if (str2.length() > 0) {
                x27VarC.g(aVar, CryptoHelper.INSTANCE.encrypt$intercom_sdk_base_release(str2));
            }
        }
        return x27VarC.d();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[LOOP:0: B:19:0x004b->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(t78 t78Var, r02<? super Boolean> r02Var) {
        boolean z;
        Set setKeySet;
        Iterator it;
        Collection collectionValues = AppIdentityStore.MIGRATION_KEY_MAP.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            setKeySet = AppIdentityStore.MIGRATION_KEY_MAP.keySet();
            if (setKeySet instanceof Collection) {
                it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (getOldPrefs().contains((String) it.next())) {
                        z = true;
                    }
                }
                z = false;
            } else {
                it = setKeySet.iterator();
                while (it.hasNext()) {
                    if (getOldPrefs().contains((String) it.next())) {
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            Iterator it2 = collectionValues.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    setKeySet = AppIdentityStore.MIGRATION_KEY_MAP.keySet();
                    if ((setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                        it = setKeySet.iterator();
                        while (it.hasNext()) {
                            if (getOldPrefs().contains((String) it.next())) {
                                z = true;
                            }
                        }
                    }
                } else if (t78Var.b((t78.a) it2.next()) == null) {
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ze2
    public /* bridge */ /* synthetic */ Object shouldMigrate(t78 t78Var, r02 r02Var) {
        return shouldMigrate2(t78Var, (r02<? super Boolean>) r02Var);
    }
}
