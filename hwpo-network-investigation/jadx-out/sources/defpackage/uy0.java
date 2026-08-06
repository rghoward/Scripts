package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uy0 {
    public static final void a(final r47 r47Var, final f09 f09Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(233973821);
        if ((((bj4VarO.j(r47Var) ? 4 : 2) | i | (bj4VarO.j(f09Var) ? 32 : 16)) & 147) == 146 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            nu1.b(new kf8[]{xc6.a.a(r47Var), kc6.a.a(r47Var), uc6.a.a(r47Var)}, gr1.b(1808964477, new y47(f09Var, fr1Var), bj4VarO), bj4VarO, 56);
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(f09Var, fr1Var, i) { // from class: v47
                public final /* synthetic */ f09 u;
                public final /* synthetic */ fr1 v;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(385);
                    uy0.a(this.t, this.u, this.v, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    public static final void b(final f09 f09Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        bj4 bj4VarO = jt1Var.o(832919318);
        int i2 = (bj4VarO.j(f09Var) ? 4 : 2) | i | (bj4VarO.j(fr1Var) ? 32 : 16);
        if ((i2 & 19) == 18 && bj4VarO.r()) {
            bj4VarO.u();
        } else {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                objF = new w47(0);
                bj4VarO.C(objF);
            }
            oh4 oh4Var = (oh4) objF;
            whb whbVarA = xc6.a(bj4VarO);
            if (whbVarA == null) {
                aa0.c("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            sd1 sd1VarA = ll8.a(uh0.class);
            jc5 jc5Var = new jc5();
            jc5Var.a(ll8.a(uh0.class), oh4Var);
            uh0 uh0Var = (uh0) qhb.a(sd1VarA, whbVarA, null, jc5Var.b(), whbVarA instanceof wt4 ? ((wt4) whbVarA).getDefaultViewModelCreationExtras() : lb2.a.b, bj4VarO);
            uh0Var.u = new nkb<>(f09Var);
            f09Var.e(uh0Var.t, fr1Var, bj4VarO, ((i2 << 6) & 896) | (i2 & 112));
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4(fr1Var, i) { // from class: x47
                public final /* synthetic */ fr1 u;

                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(1);
                    uy0.b(this.t, this.u, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gy2
    public static final Bundle c(js7... js7VarArr) {
        Bundle bundle = new Bundle(js7VarArr.length);
        for (js7 js7Var : js7VarArr) {
            String str = (String) js7Var.t;
            B b = js7Var.u;
            if (b == 0) {
                bundle.putString(str, null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(str, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(str, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(str, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(str, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(str, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(str, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(str, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(str, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(str, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(str, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(str, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) b);
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b);
            } else if (b instanceof IBinder) {
                bundle.putBinder(str, (IBinder) b);
            } else if (b instanceof Size) {
                bundle.putSize(str, (Size) b);
            } else {
                if (!(b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) b);
            }
        }
        return bundle;
    }
}
