package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class wa implements ni4, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public wa(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return this.isTopLevel == waVar.isTopLevel && this.arity == waVar.arity && this.flags == waVar.flags && xj5.a(this.receiver, waVar.receiver) && xj5.a(this.owner, waVar.owner) && this.name.equals(waVar.name) && this.signature.equals(waVar.signature);
    }

    @Override // defpackage.ni4
    public int getArity() {
        return this.arity;
    }

    public xn5 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return ll8.a(cls);
        }
        ll8.a.getClass();
        return new zn7(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((ru3.c(ru3.c((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        ll8.a.getClass();
        return ml8.a(this);
    }

    public wa(int i, Class cls, String str, String str2, int i2) {
        this(i, s21.NO_RECEIVER, cls, str, str2, i2);
    }
}
