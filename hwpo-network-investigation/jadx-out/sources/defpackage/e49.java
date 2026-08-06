package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e49 implements zeb, o31 {
    public int B;
    public SurfaceTexture C;
    public byte[] F;
    public final AtomicBoolean t = new AtomicBoolean();
    public final AtomicBoolean u = new AtomicBoolean(true);
    public final le8 v = new le8();
    public final gh4 w = new gh4();
    public final soa<Long> x = new soa<>();
    public final soa<je8> y = new soa<>();
    public final float[] z = new float[16];
    public final float[] A = new float[16];
    public volatile int D = 0;
    public int E = -1;

    public final SurfaceTexture a() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            om4.b();
            this.v.a();
            om4.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            om4.b();
            int i = iArr[0];
            om4.a(36197, i);
            this.B = i;
        } catch (om4.a e) {
            md6.e("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.B);
        this.C = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: d49
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.t.t.set(true);
            }
        });
        return this.C;
    }

    @Override // defpackage.o31
    public final void c(long j, float[] fArr) {
        this.w.c.a(j, fArr);
    }

    @Override // defpackage.o31
    public final void e() {
        this.x.b();
        gh4 gh4Var = this.w;
        gh4Var.c.b();
        gh4Var.d = false;
        this.u.set(true);
    }

    @Override // defpackage.zeb
    public final void f(long j, long j2, id4 id4Var, MediaFormat mediaFormat) {
        int i;
        ArrayList<je8.a> arrayListA;
        this.x.a(j2, Long.valueOf(j));
        byte[] bArr = id4Var.C;
        int i2 = id4Var.D;
        byte[] bArr2 = this.F;
        int i3 = this.E;
        this.F = bArr;
        if (i2 == -1) {
            i2 = this.D;
        }
        this.E = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.F)) {
            return;
        }
        byte[] bArr3 = this.F;
        je8 je8Var = null;
        if (bArr3 != null) {
            int i4 = this.E;
            pt7 pt7Var = new pt7(bArr3);
            try {
                pt7Var.N(4);
                int iM = pt7Var.m();
                pt7Var.M(0);
                if (iM == 1886547818) {
                    pt7Var.N(8);
                    int i5 = pt7Var.b;
                    int i6 = pt7Var.c;
                    while (true) {
                        if (i5 < i6) {
                            int iM2 = pt7Var.m() + i5;
                            if (iM2 > i5 && iM2 <= i6) {
                                int iM3 = pt7Var.m();
                                if (iM3 != 2037673328 && iM3 != 1836279920) {
                                    pt7Var.M(iM2);
                                    i5 = iM2;
                                }
                                pt7Var.L(iM2);
                                arrayListA = ke8.a(pt7Var);
                            }
                        }
                        arrayListA = null;
                    }
                } else {
                    arrayListA = ke8.a(pt7Var);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    je8.a aVar = arrayListA.get(0);
                    je8Var = new je8(aVar, aVar, i4);
                } else if (size == 2) {
                    je8Var = new je8(arrayListA.get(0), arrayListA.get(1), i4);
                }
            }
        }
        if (je8Var == null || !le8.b(je8Var)) {
            int i7 = this.E;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < 36; i10 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i10 * f) - f3;
                i = i10 + 1;
                float f5 = (i * f) - f3;
                int i11 = 0;
                while (i11 < 73) {
                    int i12 = i;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        float f6 = radians;
                        float f7 = i11 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i13 == 0 ? f4 : f5;
                        fArr[i8] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i8 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i8 + 3;
                        float f9 = f;
                        fArr[i8 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i9] = f7 / f8;
                        int i16 = i9 + 2;
                        fArr2[i9 + 1] = ((i10 + i13) * f9) / f6;
                        if ((i11 == 0 && i13 == 0) || (i11 == 72 && i13 == 1)) {
                            System.arraycopy(fArr, i8, fArr, i15, 3);
                            i8 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i9, fArr2, i16, 2);
                            i9 += 4;
                        } else {
                            i14 = 2;
                            i8 = i15;
                            i9 = i16;
                        }
                        i13++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i11++;
                    i = i12;
                }
            }
            je8.a aVar2 = new je8.a(new je8.b(0, 1, fArr, fArr2));
            je8Var = new je8(aVar2, aVar2, i7);
        }
        this.y.a(j2, je8Var);
    }
}
