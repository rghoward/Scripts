package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class oi4 extends s21 implements ni4, yn5 {
    private final int arity;

    public oi4(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.s21
    public vn5 computeReflected() {
        ll8.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oi4) {
            oi4 oi4Var = (oi4) obj;
            return getName().equals(oi4Var.getName()) && getSignature().equals(oi4Var.getSignature()) && xj5.a(getBoundReceiver(), oi4Var.getBoundReceiver()) && xj5.a(getOwner(), oi4Var.getOwner());
        }
        if (obj instanceof yn5) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.ni4
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.s21
    public yn5 getReflected() {
        return (yn5) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.yn5
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.yn5
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.yn5
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.yn5
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.s21, defpackage.vn5, defpackage.yn5
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        vn5 vn5VarCompute = compute();
        if (vn5VarCompute != this) {
            return vn5VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public oi4(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public oi4(int i) {
        this(i, s21.NO_RECEIVER, null, null, null, 0);
    }
}
