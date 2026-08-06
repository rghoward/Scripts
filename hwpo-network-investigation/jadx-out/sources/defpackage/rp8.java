package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.c;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rp8<TranscodeType> extends vk0<rp8<TranscodeType>> {
    public final Context K;
    public final lq8 L;
    public final Class<TranscodeType> M;
    public final c N;
    public rwa<?, ? super TranscodeType> O;
    public Object P;
    public ArrayList Q;
    public rp8<TranscodeType> R;
    public rp8<TranscodeType> S;
    public boolean T = true;
    public boolean U;
    public boolean V;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[p98.values().length];
            b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    public rp8(com.bumptech.glide.a aVar, lq8 lq8Var, Class<TranscodeType> cls, Context context) {
        oq8 oq8Var;
        this.L = lq8Var;
        this.M = cls;
        this.K = context;
        Map<Class<?>, rwa<?, ?>> map = lq8Var.t.v.f;
        rwa value = map.get(cls);
        if (value == null) {
            for (Map.Entry<Class<?>, rwa<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    value = entry.getValue();
                }
            }
        }
        this.O = value == null ? c.k : value;
        this.N = aVar.v;
        Iterator<kq8<Object>> it = lq8Var.B.iterator();
        while (it.hasNext()) {
            t((kq8) it.next());
        }
        synchronized (lq8Var) {
            oq8Var = lq8Var.C;
        }
        a(oq8Var);
    }

    public final rp8 A(x73 x73Var) {
        if (this.H) {
            return clone().A(x73Var);
        }
        this.O = x73Var;
        this.T = false;
        l();
        return this;
    }

    @Override // defpackage.vk0
    public final boolean equals(Object obj) {
        if (!(obj instanceof rp8)) {
            return false;
        }
        rp8 rp8Var = (rp8) obj;
        return super.equals(rp8Var) && Objects.equals(this.M, rp8Var.M) && this.O.equals(rp8Var.O) && Objects.equals(this.P, rp8Var.P) && Objects.equals(this.Q, rp8Var.Q) && Objects.equals(this.R, rp8Var.R) && Objects.equals(this.S, rp8Var.S) && this.T == rp8Var.T && this.U == rp8Var.U;
    }

    @Override // defpackage.vk0
    public final int hashCode() {
        return l6b.g(this.U ? 1 : 0, l6b.g(this.T ? 1 : 0, l6b.h(l6b.h(l6b.h(l6b.h(l6b.h(l6b.h(l6b.h(super.hashCode(), this.M), this.O), this.P), this.Q), this.R), this.S), null)));
    }

    public final rp8<TranscodeType> t(kq8<TranscodeType> kq8Var) {
        if (this.H) {
            return clone().t(kq8Var);
        }
        if (kq8Var != null) {
            if (this.Q == null) {
                this.Q = new ArrayList();
            }
            this.Q.add(kq8Var);
        }
        l();
        return this;
    }

    @Override // defpackage.vk0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final rp8<TranscodeType> a(vk0<?> vk0Var) {
        ov9.c(vk0Var);
        return (rp8) super.a(vk0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kp8 v(Object obj, j9a j9aVar, wp8 wp8Var, rwa rwaVar, p98 p98Var, int i, int i2, vk0 vk0Var) {
        wp8 wp8Var2;
        wp8 bm3Var;
        vk0 vk0Var2;
        kp8 hq9Var;
        p98 p98Var2;
        if (this.S != null) {
            bm3Var = new bm3(obj, wp8Var);
            wp8Var2 = bm3Var;
        } else {
            wp8Var2 = null;
            bm3Var = wp8Var;
        }
        rp8<TranscodeType> rp8Var = this.R;
        if (rp8Var == null) {
            Context context = this.K;
            c cVar = this.N;
            vk0Var2 = vk0Var;
            hq9Var = new hq9(context, cVar, obj, this.P, this.M, vk0Var2, i, i2, p98Var, j9aVar, this.Q, bm3Var, cVar.g, rwaVar.t);
        } else {
            if (this.V) {
                aa0.c("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            rwa rwaVar2 = rp8Var.T ? rwaVar : rp8Var.O;
            if (vk0.f(rp8Var.t, 8)) {
                p98Var2 = this.R.v;
            } else {
                int iOrdinal = p98Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    p98Var2 = p98.t;
                } else if (iOrdinal == 2) {
                    p98Var2 = p98.u;
                } else {
                    if (iOrdinal != 3) {
                        y24.b(this.v, "unknown priority: ");
                        return null;
                    }
                    p98Var2 = p98.v;
                }
            }
            p98 p98Var3 = p98Var2;
            rp8<TranscodeType> rp8Var2 = this.R;
            int i3 = rp8Var2.z;
            int i4 = rp8Var2.y;
            if (l6b.i(i, i2)) {
                rp8<TranscodeType> rp8Var3 = this.R;
                if (!l6b.i(rp8Var3.z, rp8Var3.y)) {
                    i3 = vk0Var.z;
                    i4 = vk0Var.y;
                }
            }
            int i5 = i4;
            int i6 = i3;
            pla plaVar = new pla(obj, bm3Var);
            Context context2 = this.K;
            c cVar2 = this.N;
            hq9 hq9Var2 = new hq9(context2, cVar2, obj, this.P, this.M, vk0Var, i, i2, p98Var, j9aVar, this.Q, plaVar, cVar2.g, rwaVar.t);
            this.V = true;
            rp8<TranscodeType> rp8Var4 = this.R;
            kp8 kp8VarV = rp8Var4.v(obj, j9aVar, plaVar, rwaVar2, p98Var3, i6, i5, rp8Var4);
            this.V = false;
            plaVar.c = hq9Var2;
            plaVar.d = kp8VarV;
            vk0Var2 = vk0Var;
            hq9Var = plaVar;
        }
        if (wp8Var2 == null) {
            return hq9Var;
        }
        rp8<TranscodeType> rp8Var5 = this.S;
        int i7 = rp8Var5.z;
        int i8 = rp8Var5.y;
        if (l6b.i(i, i2)) {
            rp8<TranscodeType> rp8Var6 = this.S;
            if (!l6b.i(rp8Var6.z, rp8Var6.y)) {
                i7 = vk0Var2.z;
                i8 = vk0Var2.y;
            }
        }
        rp8<TranscodeType> rp8Var7 = this.S;
        bm3 bm3Var2 = wp8Var2;
        kp8 kp8VarV2 = rp8Var7.v(obj, j9aVar, bm3Var2, rp8Var7.O, rp8Var7.v, i7, i8, rp8Var7);
        bm3Var2.c = hq9Var;
        bm3Var2.d = kp8VarV2;
        return bm3Var2;
    }

    @Override // defpackage.vk0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final rp8<TranscodeType> clone() {
        rp8<TranscodeType> rp8Var = (rp8) super.clone();
        rp8Var.O = rp8Var.O.clone();
        if (rp8Var.Q != null) {
            rp8Var.Q = new ArrayList(rp8Var.Q);
        }
        rp8<TranscodeType> rp8Var2 = rp8Var.R;
        if (rp8Var2 != null) {
            rp8Var.R = rp8Var2.clone();
        }
        rp8<TranscodeType> rp8Var3 = rp8Var.S;
        if (rp8Var3 != null) {
            rp8Var.S = rp8Var3.clone();
        }
        return rp8Var;
    }

    public final void x(j9a j9aVar, vk0 vk0Var) {
        ov9.c(j9aVar);
        if (!this.U) {
            z90.a("You must call #load() before calling #into()");
            return;
        }
        kp8 kp8VarV = v(new Object(), j9aVar, null, this.O, vk0Var.v, vk0Var.z, vk0Var.y, vk0Var);
        kp8 kp8VarB = j9aVar.b();
        if (kp8VarV.d(kp8VarB) && (vk0Var.x || !kp8VarB.c())) {
            ov9.d(kp8VarB, "Argument must not be null");
            if (kp8VarB.isRunning()) {
                return;
            }
            kp8VarB.k();
            return;
        }
        this.L.l(j9aVar);
        j9aVar.e(kp8VarV);
        lq8 lq8Var = this.L;
        synchronized (lq8Var) {
            lq8Var.y.t.add(j9aVar);
            qq8 qq8Var = lq8Var.w;
            qq8Var.a.add(kp8VarV);
            if (qq8Var.c) {
                kp8VarV.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                qq8Var.b.add(kp8VarV);
            } else {
                kp8VarV.k();
            }
        }
    }

    public final void y(ImageView imageView) {
        vk0 vk0VarG;
        j9a p73Var;
        l6b.a();
        ov9.c(imageView);
        if (!vk0.f(this.t, AudioConstants.AUDIO_FILE_BUFFER_SIZE) && this.C && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    vk0VarG = clone().g(q43.c, new z51());
                    break;
                case 2:
                    vk0VarG = clone().g(q43.b, new a61());
                    vk0VarG.I = true;
                    break;
                case 3:
                case 4:
                case 5:
                    vk0VarG = clone().g(q43.a, new f34());
                    vk0VarG.I = true;
                    break;
                case 6:
                    vk0VarG = clone().g(q43.b, new a61());
                    vk0VarG.I = true;
                    break;
                default:
                    vk0VarG = this;
                    break;
            }
        } else {
            vk0VarG = this;
        }
        this.N.c.getClass();
        Class<TranscodeType> cls = this.M;
        if (Bitmap.class.equals(cls)) {
            p73Var = new oq0(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                x24.b(cls, ", try .as*(Class).transcode(ResourceTranscoder)", "Unhandled class: ");
                return;
            }
            p73Var = new p73(imageView);
        }
        x(p73Var, vk0VarG);
    }

    public final rp8<TranscodeType> z(Object obj) {
        if (this.H) {
            return clone().z(obj);
        }
        this.P = obj;
        this.U = true;
        l();
        return this;
    }
}
