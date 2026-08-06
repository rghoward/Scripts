package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class n4a extends am9<Integer> implements zz9<Integer> {
    @Override // defpackage.zz9
    public final Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.A;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.B + ((long) ((int) ((r() + ((long) this.D)) - this.B)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void y(int i) {
        synchronized (this) {
            Object[] objArr = this.A;
            objArr.getClass();
            f(Integer.valueOf(((Number) objArr[((int) ((this.B + ((long) ((int) ((r() + ((long) this.D)) - this.B)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
