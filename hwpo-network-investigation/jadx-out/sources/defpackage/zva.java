package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zva {
    public final et3 a;
    public final sr9 b;
    public final o91 c;
    public final t39 d;
    public final boolean e;
    public final Map<Object, Object> f;

    public /* synthetic */ zva(et3 et3Var, sr9 sr9Var, o91 o91Var, t39 t39Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : et3Var, (i & 2) != 0 ? null : sr9Var, (i & 4) != 0 ? null : o91Var, (i & 8) != 0 ? null : t39Var, (i & 32) == 0, (i & 64) != 0 ? if3.t : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zva)) {
            return false;
        }
        zva zvaVar = (zva) obj;
        return xj5.a(this.a, zvaVar.a) && xj5.a(this.b, zvaVar.b) && xj5.a(this.c, zvaVar.c) && xj5.a(this.d, zvaVar.d) && this.e == zvaVar.e && xj5.a(this.f, zvaVar.f);
    }

    public final int hashCode() {
        et3 et3Var = this.a;
        int iHashCode = (et3Var == null ? 0 : et3Var.hashCode()) * 31;
        sr9 sr9Var = this.b;
        int iHashCode2 = (iHashCode + (sr9Var == null ? 0 : sr9Var.hashCode())) * 31;
        o91 o91Var = this.c;
        int iHashCode3 = (iHashCode2 + (o91Var == null ? 0 : o91Var.hashCode())) * 31;
        t39 t39Var = this.d;
        return this.f.hashCode() + uo2.a((iHashCode3 + (t39Var != null ? t39Var.hashCode() : 0)) * 961, this.e, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.e + ", effectsMap=" + this.f + ')';
    }

    public zva(et3 et3Var, sr9 sr9Var, o91 o91Var, t39 t39Var, boolean z, Map map) {
        this.a = et3Var;
        this.b = sr9Var;
        this.c = o91Var;
        this.d = t39Var;
        this.e = z;
        this.f = map;
    }
}
