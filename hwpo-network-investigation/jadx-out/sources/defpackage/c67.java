package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class c67 {
    public static final /* synthetic */ int x = 0;
    public final String t;
    public final f67 u;
    public h67 v;
    public final fx9<o47> w;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static String a(c57 c57Var, int i) {
            c57Var.getClass();
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                Context context = c57Var.a;
                context.getClass();
                String resourceName = context.getResources().getResourceName(i);
                resourceName.getClass();
                return resourceName;
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(i);
            }
        }

        public static yc9 b(c67 c67Var) {
            c67Var.getClass();
            return ed9.d(c67Var, new x26(1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b implements Comparable<b> {
        public final c67 t;
        public final Bundle u;
        public final boolean v;
        public final int w;
        public final boolean x;
        public final int y;

        public b(c67 c67Var, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            this.t = c67Var;
            this.u = bundle;
            this.v = z;
            this.w = i;
            this.x = z2;
            this.y = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            bVar.getClass();
            boolean z = bVar.x;
            boolean z2 = bVar.v;
            Bundle bundle = bVar.u;
            boolean z3 = this.v;
            if (z3 && !z2) {
                return 1;
            }
            if (!z3 && z2) {
                return -1;
            }
            int i = this.w - bVar.w;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle2 = this.u;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                bundle2.getClass();
                int size = bundle2.size();
                bundle.getClass();
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z4 = this.x;
            if (z4 && !z) {
                return 1;
            }
            if (z4 || !z) {
                return this.y - bVar.y;
            }
            return -1;
        }
    }

    static {
        new LinkedHashMap();
    }

    public c67(p87<? extends c67> p87Var) {
        p87Var.getClass();
        LinkedHashMap linkedHashMap = r87.b;
        this.t = r87.a.a(p87Var.getClass());
        this.u = new f67(this);
        this.w = new fx9<>(0);
    }

    public final Bundle d(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.u.c;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            p47 p47Var = (p47) entry.getValue();
            p47Var.getClass();
            str.getClass();
            if (p47Var.c && (obj = p47Var.d) != null) {
                p47Var.a.put(bundleC, str, obj);
            }
        }
        if (bundle != null) {
            bundleC.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                p47 p47Var2 = (p47) entry2.getValue();
                p47Var2.getClass();
                m77<Object> m77Var = p47Var2.a;
                str2.getClass();
                if (p47Var2.b || !bundleC.containsKey(str2) || !wx.c(bundleC, str2)) {
                    try {
                        m77Var.get(bundleC, str2);
                    } catch (IllegalStateException unused) {
                    }
                }
                go2.b(aa.a("Wrong argument type for '", str2, "' in argument savedState. "), m77Var.getName(), " expected.");
                return null;
            }
        }
        return bundleC;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    public final int[] e(c67 c67Var) {
        h30 h30Var = new h30();
        while (true) {
            f67 f67Var = this.u;
            h67 h67Var = this.v;
            if ((c67Var != null ? c67Var.v : null) != null) {
                h67 h67Var2 = c67Var.v;
                h67Var2.getClass();
                if (h67Var2.y.a(f67Var.d) != this) {
                    if (h67Var != null || h67Var.y.c != f67Var.d) {
                        h30Var.addFirst(this);
                    }
                    if (!xj5.a(h67Var, c67Var) || h67Var == null) {
                        break;
                    }
                    this = h67Var;
                } else {
                    h30Var.addFirst(this);
                    break;
                }
            } else {
                if (h67Var != null) {
                    h30Var.addFirst(this);
                } else {
                    h30Var.addFirst(this);
                }
                if (!xj5.a(h67Var, c67Var)) {
                    break;
                }
                this = h67Var;
            }
        }
        List listT = th1.T(h30Var);
        ArrayList arrayList = new ArrayList(ph1.n(listT, 10));
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((c67) it.next()).u.d));
        }
        return th1.S(arrayList);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof c67)) {
                f67 f67Var = this.u;
                ArrayList arrayList = f67Var.b;
                c67 c67Var = (c67) obj;
                fx9<o47> fx9Var = c67Var.w;
                f67 f67Var2 = c67Var.u;
                boolean zA = xj5.a(arrayList, f67Var2.b);
                fx9<o47> fx9Var2 = this.w;
                if (fx9Var2.f() != fx9Var.f()) {
                    z = false;
                    break;
                }
                Iterator it = ((rx1) ed9.c(new gx9(fx9Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!xj5.a(fx9Var2.c(iIntValue), fx9Var.c(iIntValue))) {
                        z = false;
                        break;
                    }
                }
                if (f().size() != c67Var.f().size()) {
                    z2 = false;
                    break;
                }
                Set<Map.Entry<String, p47>> setEntrySet = f().entrySet();
                setEntrySet.getClass();
                Iterator<T> it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!c67Var.f().containsKey(entry.getKey()) || !xj5.a(c67Var.f().get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (f67Var.d != f67Var2.d || !xj5.a(f67Var.e, f67Var2.e) || !zA || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public final Map<String, p47> f() {
        return qi6.l(this.u.c);
    }

    public int hashCode() {
        f67 f67Var = this.u;
        int i = f67Var.d * 31;
        String str = f67Var.e;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = f67Var.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iHashCode = (((x57) obj).a.hashCode() + (iHashCode * 31)) * 961;
        }
        fx9<o47> fx9Var = this.w;
        fx9Var.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < fx9Var.f())) {
                break;
            }
            fx9Var.g(i3).getClass();
            iHashCode *= 961;
            i3++;
        }
        for (String str2 : f().keySet()) {
            int iC = ru3.c(iHashCode * 31, 31, str2);
            p47 p47Var = f().get(str2);
            iHashCode = iC + (p47Var != null ? p47Var.hashCode() : 0);
        }
        return iHashCode;
    }

    public b i(b67 b67Var) {
        boolean zC;
        ol8 ol8Var;
        aj6 aj6VarB;
        f67 f67Var = this.u;
        LinkedHashMap linkedHashMap = f67Var.c;
        String str = b67Var.b;
        Uri uri = b67Var.a;
        ArrayList arrayList = f67Var.b;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        b bVar = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            x57 x57Var = (x57) obj;
            x57Var.getClass();
            o7a o7aVar = x57Var.d;
            if (((ol8) o7aVar.getValue()) == null) {
                zC = true;
            } else if (uri == null) {
                zC = false;
            } else {
                ol8 ol8Var2 = (ol8) o7aVar.getValue();
                ol8Var2.getClass();
                zC = ol8Var2.c(uri.toString());
            }
            if (zC) {
                Bundle bundleD = uri != null ? x57Var.d(uri, linkedHashMap) : null;
                int iB = x57Var.b(uri);
                boolean z = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
                        if (uri != null && (ol8Var = (ol8) o7aVar.getValue()) != null && (aj6VarB = ol8Var.b(uri.toString())) != null) {
                            x57Var.e(aj6VarB, bundleC, linkedHashMap);
                            if (((Boolean) x57Var.e.getValue()).booleanValue()) {
                                x57Var.f(uri, bundleC, linkedHashMap);
                            }
                        }
                        if (z63.g(linkedHashMap, new l05(2, bundleC)).isEmpty()) {
                        }
                    }
                }
                b bVar2 = new b(f67Var.a, bundleD, x57Var.l, iB, z, -1);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        f67 f67Var = this.u;
        f67Var.getClass();
        sb.append(Integer.toHexString(f67Var.d));
        sb.append(")");
        String str = f67Var.e;
        if (str != null && !z2a.w(str)) {
            sb.append(" route=");
            sb.append(f67Var.e);
        }
        return sb.toString();
    }
}
