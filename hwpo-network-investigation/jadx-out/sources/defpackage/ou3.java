package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ou3 {
    public final String a;
    public final Map<Class<?>, Object> b;

    public ou3(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }

    public static ou3 a(String str) {
        return new ou3(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou3)) {
            return false;
        }
        ou3 ou3Var = (ou3) obj;
        return this.a.equals(ou3Var.a) && this.b.equals(ou3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
