package defpackage;

import defpackage.rwa;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rwa<CHILD extends rwa<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public awa<? super TranscodeType> t = gb7.b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            d55.a(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof rwa) {
            return this.t.equals(((rwa) obj).t);
        }
        return false;
    }

    public int hashCode() {
        return this.t.hashCode();
    }
}
