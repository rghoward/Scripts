package io.intercom.android.sdk.identity;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.g2b;
import defpackage.o7a;
import defpackage.r00;
import defpackage.r02;
import defpackage.ss5;
import defpackage.t78;
import defpackage.x27;
import defpackage.ze2;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppConfigStore$Companion$createSharedPrefsMigration$1 implements ze2<t78> {
    private final ss5 oldPrefs$delegate;

    public AppConfigStore$Companion$createSharedPrefsMigration$1(Context context) {
        this.oldPrefs$delegate = new o7a(new r00(0, context));
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
        Iterator it = AppConfigStore.ALL_MIGRATION_KEY_NAMES.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
        return g2b.a;
    }

    @Override // defpackage.ze2
    public Object migrate(t78 t78Var, r02<? super t78> r02Var) {
        Set<String> stringSet;
        String string;
        x27 x27VarC = t78Var.c();
        for (Map.Entry entry : AppConfigStore.STRING_MIGRATION_KEYS.entrySet()) {
            String str = (String) entry.getKey();
            t78.a aVar = (t78.a) entry.getValue();
            if (getOldPrefs().contains(str) && (string = getOldPrefs().getString(str, null)) != null) {
                x27VarC.g(aVar, string);
            }
        }
        for (Map.Entry entry2 : AppConfigStore.INT_MIGRATION_KEYS.entrySet()) {
            String str2 = (String) entry2.getKey();
            t78.a aVar2 = (t78.a) entry2.getValue();
            if (getOldPrefs().contains(str2)) {
                x27VarC.g(aVar2, new Integer(getOldPrefs().getInt(str2, 0)));
            }
        }
        for (Map.Entry entry3 : AppConfigStore.LONG_MIGRATION_KEYS.entrySet()) {
            String str3 = (String) entry3.getKey();
            t78.a aVar3 = (t78.a) entry3.getValue();
            if (getOldPrefs().contains(str3)) {
                x27VarC.g(aVar3, new Long(getOldPrefs().getLong(str3, 0L)));
            }
        }
        for (Map.Entry entry4 : AppConfigStore.BOOLEAN_MIGRATION_KEYS.entrySet()) {
            String str4 = (String) entry4.getKey();
            t78.a aVar4 = (t78.a) entry4.getValue();
            if (getOldPrefs().contains(str4)) {
                x27VarC.g(aVar4, Boolean.valueOf(getOldPrefs().getBoolean(str4, false)));
            }
        }
        for (Map.Entry entry5 : AppConfigStore.STRING_SET_MIGRATION_KEYS.entrySet()) {
            String str5 = (String) entry5.getKey();
            t78.a aVar5 = (t78.a) entry5.getValue();
            if (getOldPrefs().contains(str5) && (stringSet = getOldPrefs().getStringSet(str5, null)) != null) {
                x27VarC.g(aVar5, stringSet);
            }
        }
        return x27VarC.d();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX INFO: renamed from: shouldMigrate, reason: avoid collision after fix types in other method */
    public Object shouldMigrate2(t78 t78Var, r02<? super Boolean> r02Var) {
        boolean z;
        if (t78Var.a().isEmpty()) {
            Set set = AppConfigStore.ALL_MIGRATION_KEY_NAMES;
            if ((set instanceof Collection) && set.isEmpty()) {
                z = false;
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (getOldPrefs().contains((String) it.next())) {
                        z = true;
                    }
                }
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ze2
    public /* bridge */ /* synthetic */ Object shouldMigrate(t78 t78Var, r02 r02Var) {
        return shouldMigrate2(t78Var, (r02<? super Boolean>) r02Var);
    }
}
