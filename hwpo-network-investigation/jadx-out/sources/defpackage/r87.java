package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class r87 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = r87.b;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                p87.a aVar = (p87.a) cls.getAnnotation(p87.a.class);
                strValue = aVar != null ? aVar.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    ca0.a("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                    return null;
                }
                linkedHashMap.put(cls, strValue);
            }
            strValue.getClass();
            return strValue;
        }
    }

    public final void a(p87 p87Var) {
        p87Var.getClass();
        String strA = a.a(p87Var.getClass());
        if (strA.length() <= 0) {
            z90.a("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        p87 p87Var2 = (p87) linkedHashMap.get(strA);
        if (xj5.a(p87Var2, p87Var)) {
            return;
        }
        if (p87Var2 != null && p87Var2.b) {
            n87.b("Navigator ", p87Var, " is replacing an already attached ", p87Var2);
        } else if (p87Var.b) {
            qz1.a(p87Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final <T extends p87<?>> T b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            z90.a("navigator name cannot be an empty string");
            return null;
        }
        T t = (T) this.a.get(str);
        if (t != null) {
            return t;
        }
        aa0.c(sk0.c("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
