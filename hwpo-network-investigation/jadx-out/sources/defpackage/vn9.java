package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vn9 {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public ox7[] i;
    public Set<String> j;
    public ld6 k;
    public boolean l;
    public int m;
    public PersistableBundle n;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        public static void a(ShortcutInfo.Builder builder) {
            builder.setExcludedFromSurfaces(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public final vn9 a;

        public b(Context context, ShortcutInfo shortcutInfo) {
            ox7[] ox7VarArr;
            String string;
            vn9 vn9Var = new vn9();
            this.a = vn9Var;
            vn9Var.a = context;
            vn9Var.b = shortcutInfo.getId();
            shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            vn9Var.c = (Intent[]) Arrays.copyOf(intents, intents.length);
            vn9Var.d = shortcutInfo.getActivity();
            vn9Var.e = shortcutInfo.getShortLabel();
            vn9Var.f = shortcutInfo.getLongLabel();
            vn9Var.g = shortcutInfo.getDisabledMessage();
            if (Build.VERSION.SDK_INT >= 28) {
                shortcutInfo.getDisabledReason();
            } else {
                shortcutInfo.isEnabled();
            }
            vn9Var.j = shortcutInfo.getCategories();
            PersistableBundle extras = shortcutInfo.getExtras();
            ld6 ld6Var = null;
            if (extras == null || !extras.containsKey("extraPersonCount")) {
                ox7VarArr = null;
            } else {
                int i = extras.getInt("extraPersonCount");
                ox7VarArr = new ox7[i];
                int i2 = 0;
                while (i2 < i) {
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                    String string2 = persistableBundle.getString("name");
                    String string3 = persistableBundle.getString("uri");
                    String string4 = persistableBundle.getString("key");
                    boolean z = persistableBundle.getBoolean("isBot");
                    boolean z2 = persistableBundle.getBoolean("isImportant");
                    ox7 ox7Var = new ox7();
                    ox7Var.a = string2;
                    ox7Var.b = null;
                    ox7Var.c = string3;
                    ox7Var.d = string4;
                    ox7Var.e = z;
                    ox7Var.f = z2;
                    ox7VarArr[i2] = ox7Var;
                    i2 = i3;
                }
            }
            vn9Var.i = ox7VarArr;
            vn9 vn9Var2 = this.a;
            shortcutInfo.getUserHandle();
            vn9Var2.getClass();
            vn9 vn9Var3 = this.a;
            shortcutInfo.getLastChangedTimestamp();
            vn9Var3.getClass();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                vn9 vn9Var4 = this.a;
                shortcutInfo.isCached();
                vn9Var4.getClass();
            }
            vn9 vn9Var5 = this.a;
            shortcutInfo.isDynamic();
            vn9Var5.getClass();
            vn9 vn9Var6 = this.a;
            shortcutInfo.isPinned();
            vn9Var6.getClass();
            vn9 vn9Var7 = this.a;
            shortcutInfo.isDeclaredInManifest();
            vn9Var7.getClass();
            vn9 vn9Var8 = this.a;
            shortcutInfo.isImmutable();
            vn9Var8.getClass();
            vn9 vn9Var9 = this.a;
            shortcutInfo.isEnabled();
            vn9Var9.getClass();
            vn9 vn9Var10 = this.a;
            shortcutInfo.hasKeyFieldsOnly();
            vn9Var10.getClass();
            vn9 vn9Var11 = this.a;
            if (i4 < 29) {
                PersistableBundle extras2 = shortcutInfo.getExtras();
                if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                    ld6Var = new ld6(string);
                }
            } else if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                b78.d(locusId, "locusId cannot be null");
                String id = locusId.getId();
                if (TextUtils.isEmpty(id)) {
                    z90.a("id cannot be empty");
                    throw null;
                }
                ld6Var = new ld6(id);
            }
            vn9Var11.k = ld6Var;
            this.a.m = shortcutInfo.getRank();
            this.a.n = shortcutInfo.getExtras();
        }

        public final vn9 a() {
            vn9 vn9Var = this.a;
            if (TextUtils.isEmpty(vn9Var.e)) {
                z90.a("Shortcut must have a non-empty label");
                return null;
            }
            Intent[] intentArr = vn9Var.c;
            if (intentArr != null && intentArr.length != 0) {
                return vn9Var;
            }
            z90.a("Shortcut must have an intent");
            return null;
        }
    }

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final ShortcutInfo b() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.h(this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.m);
        PersistableBundle persistableBundle = this.n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            ox7[] ox7VarArr = this.i;
            if (ox7VarArr != null && ox7VarArr.length > 0) {
                int length = ox7VarArr.length;
                Person[] personArr = new Person[length];
                while (i < length) {
                    ox7 ox7Var = this.i[i];
                    ox7Var.getClass();
                    personArr[i] = ox7.a.a(ox7Var);
                    i++;
                }
                intents.setPersons(personArr);
            }
            ld6 ld6Var = this.k;
            if (ld6Var != null) {
                intents.setLocusId(ld6Var.b);
            }
            intents.setLongLived(this.l);
        } else {
            if (this.n == null) {
                this.n = new PersistableBundle();
            }
            ox7[] ox7VarArr2 = this.i;
            if (ox7VarArr2 != null && ox7VarArr2.length > 0) {
                this.n.putInt("extraPersonCount", ox7VarArr2.length);
                while (i < this.i.length) {
                    PersistableBundle persistableBundle2 = this.n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i2 = i + 1;
                    sb.append(i2);
                    String string = sb.toString();
                    ox7 ox7Var2 = this.i[i];
                    ox7Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = ox7Var2.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", ox7Var2.c);
                    persistableBundle3.putString("key", ox7Var2.d);
                    persistableBundle3.putBoolean("isBot", ox7Var2.e);
                    persistableBundle3.putBoolean("isImportant", ox7Var2.f);
                    persistableBundle2.putPersistableBundle(string, persistableBundle3);
                    i = i2;
                }
            }
            ld6 ld6Var2 = this.k;
            if (ld6Var2 != null) {
                this.n.putString("extraLocusId", ld6Var2.a);
            }
            this.n.putBoolean("extraLongLived", this.l);
            intents.setExtras(this.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents);
        }
        return intents.build();
    }
}
