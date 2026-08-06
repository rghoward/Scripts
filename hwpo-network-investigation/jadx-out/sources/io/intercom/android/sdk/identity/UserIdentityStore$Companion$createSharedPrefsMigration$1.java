package io.intercom.android.sdk.identity;

import android.content.Context;
import android.content.SharedPreferences;
import com.intercom.twig.BuildConfig;
import defpackage.ct1;
import defpackage.g2b;
import defpackage.mh4;
import defpackage.o7a;
import defpackage.r02;
import defpackage.ss5;
import defpackage.t78;
import defpackage.x27;
import defpackage.ze2;
import io.intercom.android.sdk.identity.UserIdentityStore$Companion$createSharedPrefsMigration$1;
import io.intercom.android.sdk.utilities.CryptoHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class UserIdentityStore$Companion$createSharedPrefsMigration$1 implements ze2<t78> {
    private final ss5 oldPrefs$delegate;

    public UserIdentityStore$Companion$createSharedPrefsMigration$1(final Context context) {
        this.oldPrefs$delegate = new o7a(new mh4() { // from class: o5b
            @Override // defpackage.mh4
            public final Object invoke() {
                return UserIdentityStore$Companion$createSharedPrefsMigration$1.oldPrefs_delegate$lambda$0(context);
            }
        });
    }

    private final SharedPreferences getOldPrefs() {
        return (SharedPreferences) this.oldPrefs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences oldPrefs_delegate$lambda$0(Context context) {
        return context.getSharedPreferences("INTERCOM_SDK_USER_PREFS", 0);
    }

    @Override // defpackage.ze2
    public Object cleanUp(r02<? super g2b> r02Var) {
        getOldPrefs().edit().clear().apply();
        return g2b.a;
    }

    @Override // defpackage.ze2
    public Object migrate(t78 t78Var, r02<? super t78> r02Var) {
        x27 x27VarC = t78Var.c();
        for (Map.Entry entry : UserIdentityStore.MIGRATION_KEY_MAP.entrySet()) {
            String str = (String) entry.getKey();
            t78.a aVar = (t78.a) entry.getValue();
            String strA = ct1.a("intercomsdk-session-", str);
            SharedPreferences oldPrefs = getOldPrefs();
            String str2 = BuildConfig.FLAVOR;
            String string = oldPrefs.getString(strA, BuildConfig.FLAVOR);
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
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[LOOP:0: B:19:0x004b->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0051, please report this as an issue */
    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(t78 t78Var, r02<? super Boolean> r02Var) {
        boolean z;
        Set<String> setKeySet;
        Collection collectionValues = UserIdentityStore.MIGRATION_KEY_MAP.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            setKeySet = UserIdentityStore.MIGRATION_KEY_MAP.keySet();
            if (setKeySet instanceof Collection) {
                for (String str : setKeySet) {
                    if (getOldPrefs().contains("intercomsdk-session-" + str)) {
                        z = true;
                    }
                }
                z = false;
            } else {
                while (r4.hasNext()) {
                    if (getOldPrefs().contains("intercomsdk-session-" + str)) {
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    setKeySet = UserIdentityStore.MIGRATION_KEY_MAP.keySet();
                    if ((setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                        while (r4.hasNext()) {
                            if (getOldPrefs().contains("intercomsdk-session-" + str)) {
                                z = true;
                            }
                        }
                    }
                } else if (t78Var.b((t78.a) it.next()) == null) {
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
