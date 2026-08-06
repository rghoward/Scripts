package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x57 {
    public static final ol8 m = new ol8("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final ol8 n = new ol8("\\{(.+?)\\}");
    public static final ol8 o = new ol8("http[s]?://");
    public static final ol8 p = new ol8(".*");
    public static final ol8 q = new ol8("([^/]*?|)");
    public static final ol8 r = new ol8("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final o7a d;
    public final o7a e;
    public final ss5 f;
    public boolean g;
    public final ss5 h;
    public final ss5 i;
    public final ss5 j;
    public final o7a k;
    public final boolean l;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    /* JADX INFO: loaded from: classes3.dex */
    public static final class a {
        public String a;
        public final ArrayList b = new ArrayList();
    }

    public x57(String str) {
        this.a = str;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        int i = 2;
        this.d = new o7a(new w01(i, this));
        this.e = new o7a(new x01(i, this));
        q26 q26Var = new q26(1 == true ? 1 : 0, this);
        j26 j26Var = j26.u;
        this.f = hv5.c(j26Var, q26Var);
        this.h = hv5.c(j26Var, new mh4() { // from class: v57
            @Override // defpackage.mh4
            public final Object invoke() {
                String str2 = this.t.a;
                Uri uri = Uri.parse(str2);
                uri.getClass();
                if (uri.getFragment() == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                Uri uri2 = Uri.parse(str2);
                uri2.getClass();
                String fragment = uri2.getFragment();
                StringBuilder sb = new StringBuilder();
                fragment.getClass();
                x57.a(fragment, arrayList2, sb);
                return new js7(arrayList2, sb.toString());
            }
        });
        this.i = hv5.c(j26Var, new mh4() { // from class: w57
            @Override // defpackage.mh4
            public final Object invoke() {
                List list;
                js7 js7Var = (js7) this.t.h.getValue();
                return (js7Var == null || (list = (List) js7Var.t) == null) ? new ArrayList() : list;
            }
        });
        this.j = hv5.c(j26Var, new tb(i, this));
        this.k = new o7a(new ni5(i, this));
        new o7a(new vb(2, this));
        StringBuilder sb = new StringBuilder("^");
        if (!m.t.matcher(str).find()) {
            String strPattern = o.t.pattern();
            strPattern.getClass();
            sb.append(strPattern);
        }
        Pattern patternCompile = Pattern.compile("(\\?|#|$)");
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        aj6 aj6VarB = t2.b(matcher, 0, str);
        if (aj6VarB != null) {
            a(str.substring(0, aj6VarB.a().t), arrayList, sb);
            this.l = (p.t.matcher(sb).find() || q.t.matcher(sb).find()) ? false : true;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.c = g(sb.toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        ol8 ol8Var = n;
        ol8Var.getClass();
        Matcher matcher = ol8Var.t.matcher(str);
        matcher.getClass();
        int i = 0;
        for (aj6 aj6VarB = t2.b(matcher, 0, str); aj6VarB != null; aj6VarB = aj6VarB.b()) {
            xi6 xi6VarE = aj6VarB.c.e(1);
            xi6VarE.getClass();
            arrayList.add(xi6VarE.a);
            if (aj6VarB.a().t > i) {
                String strQuote = Pattern.quote(str.substring(i, aj6VarB.a().t));
                strQuote.getClass();
                sb.append(strQuote);
            }
            String strPattern = q.t.pattern();
            strPattern.getClass();
            sb.append(strPattern);
            i = aj6VarB.a().u + 1;
        }
        if (i < str.length()) {
            String strQuote2 = Pattern.quote(str.substring(i));
            strQuote2.getClass();
            sb.append(strQuote2);
        }
    }

    public static String g(String str) {
        if (z2a.o(str, "\\Q", false) && z2a.o(str, "\\E", false)) {
            return w2a.l(str, ".*", "\\E.*\\Q");
        }
        return z2a.o(str, "\\.\\*", false) ? w2a.l(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri uri2 = Uri.parse(this.a);
        uri2.getClass();
        List<String> pathSegments2 = uri2.getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : pathSegments) {
            if (pathSegments2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet.size();
    }

    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            rh1.o(((a) it.next()).b, arrayList);
        }
        return th1.K(th1.K(this.b, arrayList), (List) this.i.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        aj6 aj6VarB;
        aj6 aj6VarB2;
        String strDecode;
        uri.getClass();
        linkedHashMap.getClass();
        ol8 ol8Var = (ol8) this.d.getValue();
        if (ol8Var != null && (aj6VarB = ol8Var.b(uri.toString())) != null) {
            int i = 0;
            final Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
            if (e(aj6VarB, bundleC, linkedHashMap) && (!((Boolean) this.e.getValue()).booleanValue() || f(uri, bundleC, linkedHashMap))) {
                String fragment = uri.getFragment();
                ol8 ol8Var2 = (ol8) this.k.getValue();
                if (ol8Var2 != null && (aj6VarB2 = ol8Var2.b(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(ph1.n(list, 10));
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            ws0.m();
                            throw null;
                        }
                        String str = (String) obj;
                        xi6 xi6VarE = aj6VarB2.c.e(i2);
                        if (xi6VarE != null) {
                            strDecode = Uri.decode(xi6VarE.a);
                            strDecode.getClass();
                        } else {
                            strDecode = null;
                        }
                        if (strDecode == null) {
                            strDecode = BuildConfig.FLAVOR;
                        }
                        p47 p47Var = (p47) linkedHashMap.get(str);
                        if (p47Var != null) {
                            try {
                                p47Var.a.parseAndPut(bundleC, str, strDecode);
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            str.getClass();
                            bundleC.putString(str, strDecode);
                        }
                        arrayList.add(g2b.a);
                        i = i2;
                    }
                }
                if (z63.g(linkedHashMap, new oh4() { // from class: u57
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        String str2 = (String) obj2;
                        str2.getClass();
                        return Boolean.valueOf(!bundleC.containsKey(str2));
                    }
                }).isEmpty()) {
                    return bundleC;
                }
            }
        }
        return null;
    }

    public final boolean e(aj6 aj6Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String strDecode = null;
            if (i < 0) {
                ws0.m();
                throw null;
            }
            String str = (String) obj;
            xi6 xi6VarE = aj6Var.c.e(i3);
            if (xi6VarE != null) {
                strDecode = Uri.decode(xi6VarE.a);
                strDecode.getClass();
            }
            if (strDecode == null) {
                strDecode = BuildConfig.FLAVOR;
            }
            p47 p47Var = (p47) map.get(str);
            if (p47Var != null) {
                try {
                    p47Var.a.parseAndPut(bundle, str, strDecode);
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                str.getClass();
                bundle.putString(str, strDecode);
            }
            arrayList2.add(g2b.a);
            i = i3;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x57)) {
            return false;
        }
        return this.a.equals(((x57) obj).a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final boolean f(Uri uri, Bundle bundle, Map<String, p47> map) {
        aj6 aj6Var;
        ?? r14;
        Object objValueOf;
        boolean z;
        String query;
        x57 x57Var = this;
        for (Map.Entry entry : ((Map) x57Var.f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (x57Var.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = ws0.h(query);
            }
            boolean z2 = false;
            Bundle bundleC = uy0.c((js7[]) Arrays.copyOf(new js7[0], 0));
            ArrayList arrayList = aVar.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str2 = (String) obj;
                p47 p47Var = map.get(str2);
                m77<Object> m77Var = p47Var != null ? p47Var.a : null;
                if ((m77Var instanceof eh1) && !p47Var.c) {
                    eh1 eh1Var = (eh1) m77Var;
                    eh1Var.put(bundleC, str2, eh1Var.a());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = aVar.a;
                if (str4 != null) {
                    Pattern patternCompile = Pattern.compile(str4);
                    patternCompile.getClass();
                    str3.getClass();
                    Matcher matcher = patternCompile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        aj6Var = new aj6(matcher, str3);
                    } else {
                        aj6Var = null;
                    }
                } else {
                    aj6Var = null;
                }
                if (aj6Var == null) {
                    return z2;
                }
                ArrayList arrayList2 = aVar.b;
                ArrayList arrayList3 = new ArrayList(ph1.n(arrayList2, 10));
                int size2 = arrayList2.size();
                boolean z3 = z2;
                int i2 = z3 ? 1 : 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    int i3 = r14 + 1;
                    if (r14 < 0) {
                        r14 = z3;
                        ws0.m();
                        throw null;
                    }
                    String str5 = (String) obj2;
                    xi6 xi6VarE = aj6Var.c.e(i3);
                    String str6 = xi6VarE != null ? xi6VarE.a : null;
                    if (str6 == null) {
                        r14 = z3;
                        r14 = z3;
                        str6 = BuildConfig.FLAVOR;
                    }
                    r14 = z3;
                    r14 = z3;
                    p47 p47Var2 = map.get(str5);
                    try {
                        str5.getClass();
                        if (bundleC.containsKey(str5)) {
                            if (bundleC.containsKey(str5)) {
                                if (p47Var2 != null) {
                                    m77<Object> m77Var2 = p47Var2.a;
                                    m77Var2.parseAndPut(bundleC, str5, str6, m77Var2.get(bundleC, str5));
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            if (p47Var2 != null) {
                                p47Var2.a.parseAndPut(bundleC, str5, str6);
                            } else {
                                bundleC.putString(str5, str6);
                            }
                            objValueOf = g2b.a;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = g2b.a;
                    }
                    arrayList3.add(objValueOf);
                    z2 = false;
                    r14 = i3;
                }
                r14 = z3;
            }
            bundle.putAll(bundleC);
            x57Var = this;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
