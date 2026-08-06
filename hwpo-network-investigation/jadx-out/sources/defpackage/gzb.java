package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gzb {
    public static final vyb b = new vyb();
    public static final gzb c;
    public final ezb a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new gzb(new ezb());
    }

    public gzb(ezb ezbVar) {
        this.a = ezbVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gzb) && ((gzb) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
