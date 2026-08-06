package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarChart;
import defpackage.oj0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mj0<T extends oj0<? extends r55<? extends qj3>>> extends va1<T> implements pj0 {
    public RectF A0;
    public Matrix B0;
    public rf6 C0;
    public rf6 D0;
    public float[] E0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public Paint k0;
    public Paint l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public float p0;
    public boolean q0;
    public mrb r0;
    public mrb s0;
    public nrb t0;
    public nrb u0;
    public ova v0;
    public ova w0;
    public irb x0;
    public long y0;
    public long z0;

    @Override // defpackage.pj0
    public final ova a(mrb.a aVar) {
        return aVar == mrb.a.t ? this.v0 : this.w0;
    }

    @Override // defpackage.va1
    public void b() {
        RectF rectF = this.A0;
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        h66 h66Var = this.E;
        if (h66Var != null && h66Var.a) {
            int iOrdinal = h66Var.j.ordinal();
            if (iOrdinal == 0) {
                int iOrdinal2 = this.E.i.ordinal();
                if (iOrdinal2 == 0) {
                    float f = rectF.top;
                    h66 h66Var2 = this.E;
                    rectF.top = Math.min(h66Var2.t, this.L.d * h66Var2.r) + this.E.c + f;
                } else if (iOrdinal2 == 2) {
                    float f2 = rectF.bottom;
                    h66 h66Var3 = this.E;
                    rectF.bottom = Math.min(h66Var3.t, this.L.d * h66Var3.r) + this.E.c + f2;
                }
            } else if (iOrdinal == 1) {
                int iOrdinal3 = this.E.h.ordinal();
                if (iOrdinal3 == 0) {
                    float f3 = rectF.left;
                    h66 h66Var4 = this.E;
                    rectF.left = Math.min(h66Var4.s, this.L.c * h66Var4.r) + this.E.b + f3;
                } else if (iOrdinal3 == 1) {
                    int iOrdinal4 = this.E.i.ordinal();
                    if (iOrdinal4 == 0) {
                        float f4 = rectF.top;
                        h66 h66Var5 = this.E;
                        rectF.top = Math.min(h66Var5.t, this.L.d * h66Var5.r) + this.E.c + f4;
                    } else if (iOrdinal4 == 2) {
                        float f5 = rectF.bottom;
                        h66 h66Var6 = this.E;
                        rectF.bottom = Math.min(h66Var6.t, this.L.d * h66Var6.r) + this.E.c + f5;
                    }
                } else if (iOrdinal3 == 2) {
                    float f6 = rectF.right;
                    h66 h66Var7 = this.E;
                    rectF.right = Math.min(h66Var7.s, this.L.c * h66Var7.r) + this.E.b + f6;
                }
            }
        }
        float fE = rectF.left + 0.0f;
        float f7 = rectF.top + 0.0f;
        float fE2 = rectF.right + 0.0f;
        float f8 = rectF.bottom + 0.0f;
        mrb mrbVar = this.r0;
        boolean z = mrbVar.a;
        mrb.b bVar = mrb.b.t;
        if (z && mrbVar.u && mrbVar.J == bVar) {
            fE += mrbVar.e(this.t0.e);
        }
        mrb mrbVar2 = this.s0;
        if (mrbVar2.a && mrbVar2.u && mrbVar2.J == bVar) {
            fE2 += mrbVar2.e(this.u0.e);
        }
        hrb hrbVar = this.B;
        if (hrbVar.a && hrbVar.u) {
            float f9 = hrbVar.F + hrbVar.c;
            hrb.a aVar = hrbVar.G;
            if (aVar == hrb.a.u) {
                f8 += f9;
            } else if (aVar == hrb.a.t) {
                f7 += f9;
            } else if (aVar == hrb.a.v) {
                f8 += f9;
                f7 += f9;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f7;
        float extraRightOffset = getExtraRightOffset() + fE2;
        float extraBottomOffset = getExtraBottomOffset() + f8;
        float extraLeftOffset = getExtraLeftOffset() + fE;
        float fC = t6b.c(this.p0);
        bib bibVar = this.L;
        bibVar.b.set(Math.max(fC, extraLeftOffset), Math.max(fC, extraTopOffset), bibVar.c - Math.max(fC, extraRightOffset), bibVar.d - Math.max(fC, extraBottomOffset));
        if (this.t) {
            Log.i("MPAndroidChart", "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
            StringBuilder sb = new StringBuilder("Content: ");
            sb.append(this.L.b.toString());
            Log.i("MPAndroidChart", sb.toString());
        }
        ova ovaVar = this.w0;
        this.s0.getClass();
        ovaVar.f();
        ova ovaVar2 = this.v0;
        this.r0.getClass();
        ovaVar2.f();
        if (this.t) {
            Log.i("MPAndroidChart", "Preparing Value-Px Matrix, xmin: " + this.B.D + ", xmax: " + this.B.C + ", xdelta: " + this.B.E);
        }
        ova ovaVar3 = this.w0;
        hrb hrbVar2 = this.B;
        float f10 = hrbVar2.D;
        float f11 = hrbVar2.E;
        mrb mrbVar3 = this.s0;
        ovaVar3.g(f10, f11, mrbVar3.E, mrbVar3.D);
        ova ovaVar4 = this.v0;
        hrb hrbVar3 = this.B;
        float f12 = hrbVar3.D;
        float f13 = hrbVar3.E;
        mrb mrbVar4 = this.r0;
        ovaVar4.g(f12, f13, mrbVar4.E, mrbVar4.D);
    }

    @Override // android.view.View
    public final void computeScroll() {
        db1 db1Var = this.G;
        if (db1Var instanceof nj0) {
            nj0 nj0Var = (nj0) db1Var;
            sf6 sf6Var = nj0Var.I;
            mj0 mj0Var = nj0Var.w;
            sf6 sf6Var2 = nj0Var.z;
            sf6 sf6Var3 = nj0Var.H;
            if (sf6Var.b == 0.0f && sf6Var.c == 0.0f) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            sf6Var.b = mj0Var.getDragDecelerationFrictionCoef() * sf6Var.b;
            float dragDecelerationFrictionCoef = mj0Var.getDragDecelerationFrictionCoef() * sf6Var.c;
            sf6Var.c = dragDecelerationFrictionCoef;
            float f = (jCurrentAnimationTimeMillis - nj0Var.G) / 1000.0f;
            float f2 = sf6Var3.b + (sf6Var.b * f);
            sf6Var3.b = f2;
            float f3 = sf6Var3.c + (dragDecelerationFrictionCoef * f);
            sf6Var3.c = f3;
            MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, f2, f3, 0);
            float f4 = mj0Var.g0 ? sf6Var3.b - sf6Var2.b : 0.0f;
            float f5 = mj0Var.h0 ? sf6Var3.c - sf6Var2.c : 0.0f;
            nj0Var.x.set(nj0Var.y);
            mj0Var.getOnChartGestureListener();
            nj0Var.b();
            nj0Var.x.postTranslate(f4, f5);
            motionEventObtain.recycle();
            bib viewPortHandler = mj0Var.getViewPortHandler();
            Matrix matrix = nj0Var.x;
            viewPortHandler.i(matrix, mj0Var, false);
            nj0Var.x = matrix;
            nj0Var.G = jCurrentAnimationTimeMillis;
            if (Math.abs(sf6Var.b) >= 0.01d || Math.abs(sf6Var.c) >= 0.01d) {
                DisplayMetrics displayMetrics = t6b.a;
                mj0Var.postInvalidateOnAnimation();
            } else {
                mj0Var.b();
                mj0Var.postInvalidate();
                sf6Var.b = 0.0f;
                sf6Var.c = 0.0f;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x0114  */
    /* JADX WARN: Code duplicated, block: B:40:0x012a  */
    /* JADX WARN: Code duplicated, block: B:42:0x012e  */
    /* JADX WARN: Code duplicated, block: B:44:0x013a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0177  */
    /* JADX WARN: Code duplicated, block: B:48:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x0187  */
    /* JADX WARN: Code duplicated, block: B:55:0x018e  */
    @Override // defpackage.va1
    public final void e() {
        h66.b bVar;
        ArrayList arrayList;
        String str;
        float f;
        int i;
        int i2;
        String strH;
        s55 s55Var;
        z55 z55Var;
        int i3;
        T t = this.u;
        boolean z = this.t;
        if (t == 0) {
            if (z) {
                Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
                return;
            }
            return;
        }
        if (z) {
            Log.i("MPAndroidChart", "Preparing...");
        }
        ff2 ff2Var = this.J;
        if (ff2Var != null) {
            ff2Var.v();
        }
        g();
        nrb nrbVar = this.t0;
        mrb mrbVar = this.r0;
        nrbVar.u(mrbVar.D, mrbVar.C);
        nrb nrbVar2 = this.u0;
        mrb mrbVar2 = this.s0;
        nrbVar2.u(mrbVar2.D, mrbVar2.C);
        irb irbVar = this.x0;
        hrb hrbVar = this.B;
        irbVar.u(hrbVar.D, hrbVar.C);
        if (this.E != null) {
            j66 j66Var = this.I;
            T t2 = this.u;
            Paint paint = j66Var.b;
            h66 h66Var = j66Var.d;
            h66Var.getClass();
            ArrayList arrayList2 = j66Var.e;
            arrayList2.clear();
            int i4 = 0;
            while (true) {
                int iC = t2.c();
                bVar = h66.b.t;
                if (i4 >= iC) {
                    break;
                }
                t55 t55VarB = t2.b(i4);
                List<Integer> listV = t55VarB.v();
                int iH = t55VarB.H();
                if (t55VarB instanceof q55) {
                    q55 q55Var = (q55) t55VarB;
                    if (q55Var.B()) {
                        String[] strArrD = q55Var.D();
                        for (int i5 = 0; i5 < listV.size() && i5 < q55Var.w(); i5++) {
                            arrayList2.add(new i66(strArrD[i5 % strArrD.length], t55VarB.g(), t55VarB.p(), t55VarB.n(), null, listV.get(i5).intValue()));
                        }
                        if (q55Var.h() != null) {
                            arrayList2.add(new i66(t55VarB.h(), bVar, Float.NaN, Float.NaN, null, 1122867));
                        }
                    } else if (t55VarB instanceof z55) {
                        z55Var = (z55) t55VarB;
                        for (i3 = 0; i3 < listV.size() && i3 < iH; i3++) {
                            z55Var.o(i3).getClass();
                            arrayList2.add(new i66(null, t55VarB.g(), t55VarB.p(), t55VarB.n(), null, listV.get(i3).intValue()));
                        }
                        if (z55Var.h() != null) {
                            arrayList2.add(new i66(t55VarB.h(), bVar, Float.NaN, Float.NaN, null, 1122867));
                        }
                    } else if (t55VarB instanceof s55) {
                        s55Var = (s55) t55VarB;
                        if (s55Var.M() != 1122867) {
                            int iM = s55Var.M();
                            int iE = s55Var.E();
                            arrayList2.add(new i66(null, t55VarB.g(), t55VarB.p(), t55VarB.n(), null, iM));
                            arrayList2.add(new i66(t55VarB.h(), t55VarB.g(), t55VarB.p(), t55VarB.n(), null, iE));
                        } else {
                            for (i2 = 0; i2 < listV.size() && i2 < iH; i2++) {
                                if (i2 < listV.size() - 1 || i2 >= iH - 1) {
                                    strH = t2.b(i4).h();
                                } else {
                                    strH = null;
                                }
                                arrayList2.add(new i66(strH, t55VarB.g(), t55VarB.p(), t55VarB.n(), null, listV.get(i2).intValue()));
                            }
                        }
                    } else {
                        while (i2 < listV.size()) {
                            if (i2 < listV.size() - 1) {
                                strH = t2.b(i4).h();
                            } else {
                                strH = t2.b(i4).h();
                            }
                            arrayList2.add(new i66(strH, t55VarB.g(), t55VarB.p(), t55VarB.n(), null, listV.get(i2).intValue()));
                        }
                    }
                } else if (t55VarB instanceof z55) {
                    z55Var = (z55) t55VarB;
                    while (i3 < listV.size()) {
                        z55Var.o(i3).getClass();
                        arrayList2.add(new i66(null, t55VarB.g(), t55VarB.p(), t55VarB.n(), null, listV.get(i3).intValue()));
                    }
                    if (z55Var.h() != null) {
                        arrayList2.add(new i66(t55VarB.h(), bVar, Float.NaN, Float.NaN, null, 1122867));
                    }
                } else if (t55VarB instanceof s55) {
                    s55Var = (s55) t55VarB;
                    if (s55Var.M() != 1122867) {
                        int iM2 = s55Var.M();
                        int iE2 = s55Var.E();
                        arrayList2.add(new i66(null, t55VarB.g(), t55VarB.p(), t55VarB.n(), null, iM2));
                        arrayList2.add(new i66(t55VarB.h(), t55VarB.g(), t55VarB.p(), t55VarB.n(), null, iE2));
                    } else {
                        while (i2 < listV.size()) {
                            if (i2 < listV.size() - 1) {
                                strH = t2.b(i4).h();
                            } else {
                                strH = t2.b(i4).h();
                            }
                            arrayList2.add(new i66(strH, t55VarB.g(), t55VarB.p(), t55VarB.n(), null, listV.get(i2).intValue()));
                        }
                    }
                } else {
                    while (i2 < listV.size()) {
                        if (i2 < listV.size() - 1) {
                            strH = t2.b(i4).h();
                        } else {
                            strH = t2.b(i4).h();
                        }
                        arrayList2.add(new i66(strH, t55VarB.g(), t55VarB.p(), t55VarB.n(), null, listV.get(i2).intValue()));
                    }
                }
                i4++;
            }
            h66Var.g = (i66[]) arrayList2.toArray(new i66[arrayList2.size()]);
            Typeface typeface = h66Var.d;
            if (typeface != null) {
                paint.setTypeface(typeface);
            }
            paint.setTextSize(h66Var.e);
            paint.setColor(h66Var.f);
            bib bibVar = (bib) j66Var.a;
            ArrayList arrayList3 = h66Var.v;
            ArrayList arrayList4 = h66Var.u;
            ArrayList arrayList5 = h66Var.w;
            float f2 = h66Var.m;
            float fC = t6b.c(f2);
            float fC2 = t6b.c(h66Var.q);
            float f3 = h66Var.p;
            float fC3 = t6b.c(f3);
            float fC4 = t6b.c(h66Var.o);
            float fC5 = t6b.c(0.0f);
            i66[] i66VarArr = h66Var.g;
            int length = i66VarArr.length;
            t6b.c(f3);
            i66[] i66VarArr2 = h66Var.g;
            int length2 = i66VarArr2.length;
            int i6 = 0;
            float f4 = 0.0f;
            float f5 = 0.0f;
            while (i6 < length2) {
                int i7 = length2;
                i66 i66Var = i66VarArr2[i6];
                int i8 = i6;
                float fC6 = t6b.c(Float.isNaN(i66Var.c) ? f2 : i66Var.c);
                if (fC6 > f5) {
                    f5 = fC6;
                }
                String str2 = i66Var.a;
                if (str2 != null) {
                    float fMeasureText = (int) paint.measureText(str2);
                    if (fMeasureText > f4) {
                        f4 = fMeasureText;
                    }
                }
                i6 = i8 + 1;
                length2 = i7;
            }
            i66[] i66VarArr3 = h66Var.g;
            int length3 = i66VarArr3.length;
            float f6 = 0.0f;
            int i9 = 0;
            while (i9 < length3) {
                i66[] i66VarArr4 = i66VarArr3;
                String str3 = i66VarArr4[i9].a;
                if (str3 != null) {
                    float fA = t6b.a(paint, str3);
                    if (fA > f6) {
                        f6 = fA;
                    }
                }
                i9++;
                i66VarArr3 = i66VarArr4;
            }
            int iOrdinal = h66Var.j.ordinal();
            if (iOrdinal == 0) {
                Paint.FontMetrics fontMetrics = t6b.e;
                paint.getFontMetrics(fontMetrics);
                float f7 = fontMetrics.descent - fontMetrics.ascent;
                paint.getFontMetrics(fontMetrics);
                float f8 = (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom + fC5;
                bibVar.b.width();
                arrayList3.clear();
                arrayList4.clear();
                arrayList5.clear();
                int i10 = -1;
                int i11 = 0;
                float f9 = 0.0f;
                float f10 = 0.0f;
                float fMax = 0.0f;
                while (i11 < length) {
                    i66 i66Var2 = i66VarArr[i11];
                    float f11 = f8;
                    h66.b bVar2 = i66Var2.b;
                    int i12 = length;
                    float f12 = i66Var2.c;
                    boolean z2 = bVar2 != bVar;
                    float fC7 = Float.isNaN(f12) ? fC : t6b.c(f12);
                    String str4 = i66Var2.a;
                    boolean z3 = z2;
                    arrayList3.add(Boolean.FALSE);
                    float f13 = i10 == -1 ? 0.0f : f9 + fC2;
                    if (str4 != null) {
                        arrayList = arrayList3;
                        arrayList4.add(t6b.b(paint, str4));
                        f = f13 + (z3 ? fC3 + fC7 : 0.0f) + ((ts3) arrayList4.get(i11)).b;
                        str = str4;
                        i = -1;
                    } else {
                        arrayList = arrayList3;
                        ts3 ts3Var = (ts3) ts3.d.b();
                        str = str4;
                        ts3Var.b = 0.0f;
                        ts3Var.c = 0.0f;
                        arrayList4.add(ts3Var);
                        if (!z3) {
                            fC7 = 0.0f;
                        }
                        f = f13 + fC7;
                        i = -1;
                        if (i10 == -1) {
                            i10 = i11;
                        }
                    }
                    if (str != null || i11 == i12 - 1) {
                        float f14 = (f10 == 0.0f ? 0.0f : fC4) + f + f10;
                        if (i11 == i12 - 1) {
                            ts3 ts3Var2 = (ts3) ts3.d.b();
                            ts3Var2.b = f14;
                            ts3Var2.c = f7;
                            arrayList5.add(ts3Var2);
                            fMax = Math.max(fMax, f14);
                        }
                        f10 = f14;
                    }
                    if (str != null) {
                        i10 = i;
                    }
                    i11++;
                    arrayList3 = arrayList;
                    length = i12;
                    f9 = f;
                    f8 = f11;
                }
                float f15 = f8;
                h66Var.s = fMax;
                h66Var.t = (f15 * (arrayList5.size() == 0 ? 0 : arrayList5.size() - 1)) + (f7 * arrayList5.size());
            } else if (iOrdinal == 1) {
                Paint.FontMetrics fontMetrics2 = t6b.e;
                paint.getFontMetrics(fontMetrics2);
                float f16 = fontMetrics2.descent - fontMetrics2.ascent;
                float fMax2 = 0.0f;
                float f17 = 0.0f;
                float fMeasureText2 = 0.0f;
                boolean z4 = false;
                for (int i13 = 0; i13 < length; i13++) {
                    i66 i66Var3 = i66VarArr[i13];
                    h66.b bVar3 = i66Var3.b;
                    float f18 = i66Var3.c;
                    boolean z5 = bVar3 != bVar;
                    float fC8 = Float.isNaN(f18) ? fC : t6b.c(f18);
                    String str5 = i66Var3.a;
                    if (!z4) {
                        fMeasureText2 = 0.0f;
                    }
                    if (z5) {
                        if (z4) {
                            fMeasureText2 += fC2;
                        }
                        fMeasureText2 += fC8;
                    }
                    if (str5 != null) {
                        if (z5 && !z4) {
                            fMeasureText2 += fC3;
                        } else if (z4) {
                            fMax2 = Math.max(fMax2, fMeasureText2);
                            f17 += f16 + fC5;
                            fMeasureText2 = 0.0f;
                            z4 = false;
                        }
                        fMeasureText2 += (int) paint.measureText(str5);
                        if (i13 < length - 1) {
                            f17 = f16 + fC5 + f17;
                        }
                    } else {
                        fMeasureText2 += fC8;
                        if (i13 < length - 1) {
                            fMeasureText2 += fC2;
                        }
                        z4 = true;
                    }
                    fMax2 = Math.max(fMax2, fMeasureText2);
                }
                h66Var.s = fMax2;
                h66Var.t = f17;
            }
            h66Var.t += h66Var.c;
            h66Var.s += h66Var.b;
        }
        b();
    }

    public void g() {
        hrb hrbVar = this.B;
        T t = this.u;
        hrbVar.a(((oj0) t).d, ((oj0) t).c);
        mrb mrbVar = this.r0;
        oj0 oj0Var = (oj0) this.u;
        mrb.a aVar = mrb.a.t;
        mrbVar.a(oj0Var.g(aVar), ((oj0) this.u).f(aVar));
        mrb mrbVar2 = this.s0;
        oj0 oj0Var2 = (oj0) this.u;
        mrb.a aVar2 = mrb.a.u;
        mrbVar2.a(oj0Var2.g(aVar2), ((oj0) this.u).f(aVar2));
    }

    public mrb getAxisLeft() {
        return this.r0;
    }

    public mrb getAxisRight() {
        return this.s0;
    }

    @Override // defpackage.va1, defpackage.za1, defpackage.pj0
    public /* bridge */ /* synthetic */ oj0 getData() {
        return (oj0) super.getData();
    }

    public kh7 getDrawListener() {
        return null;
    }

    public float getHighestVisibleX() {
        ova ovaVarA = a(mrb.a.t);
        RectF rectF = this.L.b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        rf6 rf6Var = this.D0;
        ovaVarA.c(f, f2, rf6Var);
        return (float) Math.min(this.B.C, rf6Var.b);
    }

    public float getLowestVisibleX() {
        ova ovaVarA = a(mrb.a.t);
        RectF rectF = this.L.b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        rf6 rf6Var = this.C0;
        ovaVarA.c(f, f2, rf6Var);
        return (float) Math.max(this.B.D, rf6Var.b);
    }

    @Override // defpackage.va1, defpackage.za1
    public int getMaxVisibleCount() {
        return this.b0;
    }

    public float getMinOffset() {
        return this.p0;
    }

    public nrb getRendererLeftYAxis() {
        return this.t0;
    }

    public nrb getRendererRightYAxis() {
        return this.u0;
    }

    public irb getRendererXAxis() {
        return this.x0;
    }

    @Override // android.view.View
    public float getScaleX() {
        bib bibVar = this.L;
        if (bibVar == null) {
            return 1.0f;
        }
        return bibVar.i;
    }

    @Override // android.view.View
    public float getScaleY() {
        bib bibVar = this.L;
        if (bibVar == null) {
            return 1.0f;
        }
        return bibVar.j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // defpackage.va1
    public float getYChartMax() {
        return Math.max(this.r0.C, this.s0.C);
    }

    @Override // defpackage.va1
    public float getYChartMin() {
        return Math.min(this.r0.D, this.s0.D);
    }

    public final void h(mrb.a aVar) {
        (aVar == mrb.a.t ? this.r0 : this.s0).getClass();
    }

    /* JADX WARN: Code duplicated, block: B:436:0x0a49  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.va1, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Canvas canvas2;
        ArrayList arrayList;
        ArrayList arrayList2;
        float f6;
        h66.b bVar;
        int i;
        Paint paint;
        float f7;
        float f8;
        float f9;
        float f10;
        j66 j66Var;
        h66.a aVar;
        float f11;
        boolean z;
        Canvas canvas3;
        float f12;
        String str;
        float fMeasureText;
        float f13;
        float f14;
        float fWidth;
        rw4[] rw4VarArr;
        rw4[] rw4VarArr2;
        int i2;
        float f15;
        float f16;
        int i3;
        fj0 fj0Var;
        Paint paint2;
        float f17;
        float f18;
        fj0 fj0Var2;
        float f19;
        float fAbs;
        float f20;
        float f21;
        hrb.a aVar2;
        mj0<T> mj0Var = this;
        Canvas canvas4 = canvas;
        super.onDraw(canvas);
        if (mj0Var.u == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (mj0Var.m0) {
            canvas4.drawRect(mj0Var.L.b, mj0Var.k0);
        }
        if (mj0Var.n0) {
            canvas4.drawRect(mj0Var.L.b, mj0Var.l0);
        }
        if (mj0Var.c0) {
            float lowestVisibleX = mj0Var.getLowestVisibleX();
            float highestVisibleX = mj0Var.getHighestVisibleX();
            oj0 oj0Var = (oj0) mj0Var.u;
            ArrayList arrayList3 = oj0Var.i;
            int size = arrayList3.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList3.get(i4);
                i4++;
                ((t55) obj).x(lowestVisibleX, highestVisibleX);
            }
            oj0Var.a();
            hrb hrbVar = mj0Var.B;
            oj0 oj0Var2 = (oj0) mj0Var.u;
            hrbVar.a(oj0Var2.d, oj0Var2.c);
            mrb mrbVar = mj0Var.r0;
            if (mrbVar.a) {
                oj0 oj0Var3 = (oj0) mj0Var.u;
                mrb.a aVar3 = mrb.a.t;
                mrbVar.a(oj0Var3.g(aVar3), ((oj0) mj0Var.u).f(aVar3));
            }
            mrb mrbVar2 = mj0Var.s0;
            if (mrbVar2.a) {
                oj0 oj0Var4 = (oj0) mj0Var.u;
                mrb.a aVar4 = mrb.a.u;
                mrbVar2.a(oj0Var4.g(aVar4), ((oj0) mj0Var.u).f(aVar4));
            }
            mj0Var.b();
        }
        mrb mrbVar3 = mj0Var.r0;
        if (mrbVar3.a) {
            mj0Var.t0.u(mrbVar3.D, mrbVar3.C);
        }
        mrb mrbVar4 = mj0Var.s0;
        if (mrbVar4.a) {
            mj0Var.u0.u(mrbVar4.D, mrbVar4.C);
        }
        hrb hrbVar2 = mj0Var.B;
        if (hrbVar2.a) {
            mj0Var.x0.u(hrbVar2.D, hrbVar2.C);
        }
        irb irbVar = mj0Var.x0;
        bib bibVar = (bib) irbVar.a;
        Paint paint3 = irbVar.f;
        hrb hrbVar3 = irbVar.h;
        boolean z2 = hrbVar3.t;
        hrb.a aVar5 = hrb.a.x;
        hrb.a aVar6 = hrb.a.u;
        hrb.a aVar7 = hrb.a.w;
        hrb.a aVar8 = hrb.a.t;
        if (z2 && hrbVar3.a) {
            paint3.setColor(hrbVar3.j);
            paint3.setStrokeWidth(hrbVar3.k);
            paint3.setPathEffect(null);
            hrb.a aVar9 = hrbVar3.G;
            hrb.a aVar10 = hrb.a.v;
            if (aVar9 == aVar8 || aVar9 == aVar7 || aVar9 == aVar10) {
                RectF rectF = bibVar.b;
                float f22 = rectF.left;
                float f23 = rectF.top;
                aVar2 = aVar10;
                canvas4.drawLine(f22, f23, rectF.right, f23, paint3);
            } else {
                aVar2 = aVar10;
            }
            hrb.a aVar11 = hrbVar3.G;
            if (aVar11 == aVar6 || aVar11 == aVar5 || aVar11 == aVar2) {
                RectF rectF2 = bibVar.b;
                float f24 = rectF2.left;
                float f25 = rectF2.bottom;
                float f26 = rectF2.right;
                canvas4 = canvas;
                canvas4.drawLine(f24, f25, f26, f25, paint3);
            } else {
                canvas4 = canvas;
            }
        }
        mj0Var.t0.y(canvas4);
        mj0Var.u0.y(canvas4);
        if (mj0Var.B.x) {
            mj0Var.x0.z(canvas4);
        }
        if (mj0Var.r0.x) {
            mj0Var.t0.z(canvas4);
        }
        if (mj0Var.s0.x) {
            mj0Var.u0.z(canvas4);
        }
        boolean z3 = mj0Var.B.a;
        boolean z4 = mj0Var.r0.a;
        boolean z5 = mj0Var.s0.a;
        int iSave = canvas4.save();
        canvas4.clipRect(mj0Var.L.b);
        fj0 fj0Var3 = (fj0) mj0Var.J;
        hj0 barData = fj0Var3.f.getBarData();
        int i5 = 0;
        while (i5 < barData.c()) {
            q55 q55Var = (q55) barData.b(i5);
            if (q55Var.isVisible()) {
                Paint paint4 = fj0Var3.i;
                wa1 wa1Var = fj0Var3.b;
                RectF rectF3 = fj0Var3.k;
                i3 = i5;
                Paint paint5 = fj0Var3.c;
                bib bibVar2 = (bib) fj0Var3.a;
                BarChart barChart = fj0Var3.f;
                ova ovaVarA = barChart.a(q55Var.G());
                Paint paint6 = fj0Var3.j;
                paint6.setColor(q55Var.d());
                paint6.setStrokeWidth(t6b.c(0.0f));
                wa1Var.getClass();
                if (barChart.H0) {
                    paint4.setColor(q55Var.q());
                    float f27 = barChart.getBarData().j / 2.0f;
                    int iMin = Math.min((int) Math.ceil(q55Var.H() * 1.0f), q55Var.H());
                    int i6 = 0;
                    while (i6 < iMin) {
                        int i7 = iMin;
                        float f28 = ((kj0) q55Var.o(i6)).v;
                        rectF3.left = f28 - f27;
                        rectF3.right = f28 + f27;
                        ovaVarA.a.mapRect(rectF3);
                        ovaVarA.c.a.mapRect(rectF3);
                        ovaVarA.b.mapRect(rectF3);
                        if (bibVar2.c(rectF3.right)) {
                            if (!bibVar2.d(rectF3.left)) {
                                break;
                            }
                            RectF rectF4 = bibVar2.b;
                            rectF3.top = rectF4.top;
                            rectF3.bottom = rectF4.bottom;
                            canvas4.drawRect(rectF3, paint4);
                        }
                        i6++;
                        iMin = i7;
                    }
                }
                dj0 dj0Var = fj0Var3.h[i3];
                dj0Var.getClass();
                float[] fArr = dj0Var.b;
                barChart.h(q55Var.G());
                dj0Var.d = false;
                dj0Var.e = barChart.getBarData().j;
                float fH = q55Var.H() * 1.0f;
                float f29 = dj0Var.e / 2.0f;
                int i8 = 0;
                while (i8 < fH) {
                    kj0 kj0Var = (kj0) q55Var.o(i8);
                    if (kj0Var == null) {
                        f17 = fH;
                        f18 = f29;
                    } else {
                        f17 = fH;
                        float f30 = kj0Var.v;
                        float f31 = kj0Var.t;
                        float[] fArr2 = kj0Var.w;
                        f18 = f29;
                        if (!dj0Var.c || fArr2 == null) {
                            fj0Var2 = fj0Var3;
                            float f32 = f30 - f18;
                            float f33 = f30 + f18;
                            if (dj0Var.d) {
                                f19 = f31 >= 0.0f ? f31 : 0.0f;
                                if (f31 > 0.0f) {
                                    f31 = 0.0f;
                                }
                            } else {
                                float f34 = f31 >= 0.0f ? f31 : 0.0f;
                                if (f31 > 0.0f) {
                                    f31 = 0.0f;
                                }
                                float f35 = f31;
                                f31 = f34;
                                f19 = f35;
                            }
                            if (f31 > 0.0f) {
                                f31 *= 1.0f;
                            } else {
                                f19 *= 1.0f;
                            }
                            dj0Var.a(f32, f31, f33, f19);
                        } else {
                            float fAbs2 = -kj0Var.y;
                            float f36 = 0.0f;
                            int i9 = 0;
                            while (i9 < fArr2.length) {
                                float f37 = fArr2[i9];
                                if (f37 == 0.0f && (f36 == 0.0f || fAbs2 == 0.0f)) {
                                    fAbs = f37;
                                    f20 = fAbs;
                                } else if (f37 >= 0.0f) {
                                    fAbs = f36 + f37;
                                    f20 = f36;
                                    f36 = fAbs;
                                } else {
                                    fAbs = Math.abs(f37) + fAbs2;
                                    f20 = fAbs2;
                                    fAbs2 = Math.abs(f37) + fAbs2;
                                }
                                float f38 = f30 - f18;
                                float[] fArr3 = fArr2;
                                float f39 = f30 + f18;
                                int i10 = i9;
                                if (dj0Var.d) {
                                    float f40 = f20 >= fAbs ? f20 : fAbs;
                                    if (f20 <= fAbs) {
                                        fAbs = f20;
                                    }
                                    f21 = f40;
                                } else {
                                    float f41 = f20 >= fAbs ? f20 : fAbs;
                                    if (f20 <= fAbs) {
                                        fAbs = f20;
                                    }
                                    f21 = fAbs;
                                    fAbs = f41;
                                }
                                dj0Var.a(f38, fAbs * 1.0f, f39, f21 * 1.0f);
                                i9 = i10 + 1;
                                fj0Var3 = fj0Var3;
                                fArr2 = fArr3;
                            }
                        }
                        i8++;
                        fH = f17;
                        f29 = f18;
                        fj0Var3 = fj0Var2;
                    }
                    fj0Var2 = fj0Var3;
                    i8++;
                    fH = f17;
                    f29 = f18;
                    fj0Var3 = fj0Var2;
                }
                fj0Var = fj0Var3;
                dj0Var.a = 0;
                ovaVarA.e(fArr);
                boolean z6 = q55Var.v().size() == 1;
                if (z6) {
                    paint5.setColor(q55Var.J());
                }
                int i11 = 0;
                while (i11 < fArr.length) {
                    int i12 = i11 + 2;
                    if (!bibVar2.c(fArr[i12])) {
                        paint2 = paint5;
                    } else {
                        if (!bibVar2.d(fArr[i11])) {
                            break;
                        }
                        if (!z6) {
                            paint5.setColor(q55Var.a(i11 / 4));
                        }
                        paint2 = paint5;
                        canvas.drawRect(fArr[i11], fArr[i11 + 1], fArr[i12], fArr[i11 + 3], paint2);
                    }
                    i11 += 4;
                    paint5 = paint2;
                    q55Var = q55Var;
                    bibVar2 = bibVar2;
                }
                canvas4 = canvas;
            } else {
                i3 = i5;
                fj0Var = fj0Var3;
            }
            i5 = i3 + 1;
            jCurrentTimeMillis = jCurrentTimeMillis;
            barData = barData;
            aVar5 = aVar5;
            fj0Var3 = fj0Var;
        }
        long j = jCurrentTimeMillis;
        hrb.a aVar12 = aVar5;
        float f42 = 0.0f;
        if (!mj0Var.B.x) {
            mj0Var.x0.z(canvas4);
        }
        if (!mj0Var.r0.x) {
            mj0Var.t0.z(canvas4);
        }
        if (!mj0Var.s0.x) {
            mj0Var.u0.z(canvas4);
        }
        rw4[] rw4VarArr3 = mj0Var.S;
        if (rw4VarArr3 != null && rw4VarArr3.length > 0 && rw4VarArr3[0] != null) {
            fj0 fj0Var4 = (fj0) mj0Var.J;
            RectF rectF5 = fj0Var4.g;
            BarChart barChart2 = fj0Var4.f;
            hj0 barData2 = barChart2.getBarData();
            int length = rw4VarArr3.length;
            int i13 = 0;
            while (i13 < length) {
                rw4 rw4Var = rw4VarArr3[i13];
                int i14 = rw4Var.f;
                int i15 = rw4Var.g;
                q55 q55Var2 = (q55) barData2.b(i14);
                if (q55Var2 == null || !q55Var2.K()) {
                    rw4VarArr2 = rw4VarArr3;
                    i2 = length;
                } else {
                    rw4VarArr2 = rw4VarArr3;
                    i2 = length;
                    kj0 kj0Var2 = (kj0) q55Var2.L(rw4Var.a, rw4Var.b);
                    if (kj0Var2 != null) {
                        float fJ = q55Var2.j(kj0Var2);
                        float fH2 = q55Var2.H();
                        fj0Var4.b.getClass();
                        if (fJ < fH2 * 1.0f) {
                            ova ovaVarA2 = barChart2.a(q55Var2.G());
                            fj0Var4.d.setColor(q55Var2.F());
                            fj0Var4.d.setAlpha(q55Var2.z());
                            if (i15 < 0 || kj0Var2.w == null) {
                                f15 = kj0Var2.t;
                                f16 = 0.0f;
                            } else if (barChart2.F0) {
                                f15 = kj0Var2.z;
                                f16 = -kj0Var2.y;
                            } else {
                                th8 th8Var = kj0Var2.x[i15];
                                float f43 = th8Var.a;
                                f16 = th8Var.b;
                                f15 = f43;
                            }
                            float f44 = kj0Var2.v;
                            float f45 = barData2.j / 2.0f;
                            barChart2 = barChart2;
                            RectF rectF6 = fj0Var4.g;
                            rectF6.set(f44 - f45, f15, f44 + f45, f16);
                            fj0Var4.b.getClass();
                            ovaVarA2.getClass();
                            rectF6.top *= 1.0f;
                            rectF6.bottom *= 1.0f;
                            ovaVarA2.a.mapRect(rectF6);
                            ovaVarA2.c.a.mapRect(rectF6);
                            ovaVarA2.b.mapRect(rectF6);
                            float fCenterX = rectF5.centerX();
                            float f46 = rectF5.top;
                            rw4Var.i = fCenterX;
                            rw4Var.j = f46;
                            canvas4.drawRect(rectF5, fj0Var4.d);
                        }
                        i13++;
                        rw4VarArr3 = rw4VarArr2;
                        length = i2;
                        barChart2 = barChart2;
                    }
                }
                i13++;
                rw4VarArr3 = rw4VarArr2;
                length = i2;
                barChart2 = barChart2;
            }
        }
        canvas4.restoreToCount(iSave);
        mj0Var.J.getClass();
        if (mj0Var.B.a) {
            irb irbVar2 = mj0Var.x0;
            bib bibVar3 = (bib) irbVar2.a;
            RectF rectF7 = irbVar2.m;
            ArrayList arrayList4 = irbVar2.h.w;
            if (arrayList4 != null && arrayList4.size() > 0) {
                float[] fArr4 = irbVar2.l;
                fArr4[0] = 0.0f;
                fArr4[1] = 0.0f;
                int i16 = 0;
                while (i16 < arrayList4.size()) {
                    if (((z76) arrayList4.get(i16)).a) {
                        int iSave2 = canvas4.save();
                        rectF7.set(bibVar3.b);
                        float f47 = f42;
                        rectF7.inset(-0.0f, f47);
                        canvas4.clipRect(rectF7);
                        fArr4[0] = f47;
                        fArr4[1] = f47;
                        irbVar2.c.e(fArr4);
                        float[] fArr5 = irbVar2.n;
                        fArr5[0] = fArr4[0];
                        RectF rectF8 = bibVar3.b;
                        fArr5[1] = rectF8.top;
                        fArr5[2] = fArr4[0];
                        fArr5[3] = rectF8.bottom;
                        Path path = irbVar2.o;
                        path.reset();
                        path.moveTo(fArr5[0], fArr5[1]);
                        path.lineTo(fArr5[2], fArr5[3]);
                        Paint paint7 = irbVar2.g;
                        paint7.setStyle(Paint.Style.STROKE);
                        paint7.setColor(0);
                        paint7.setStrokeWidth(0.0f);
                        paint7.setPathEffect(null);
                        canvas4.drawPath(path, paint7);
                        canvas4.restoreToCount(iSave2);
                    }
                    i16++;
                    f42 = 0.0f;
                }
            }
        }
        if (mj0Var.r0.a) {
            mj0Var.t0.A(canvas4);
        }
        if (mj0Var.s0.a) {
            mj0Var.u0.A(canvas4);
        }
        irb irbVar3 = mj0Var.x0;
        Paint paint8 = irbVar3.e;
        bib bibVar4 = (bib) irbVar3.a;
        hrb hrbVar4 = irbVar3.h;
        if (hrbVar4.a && hrbVar4.u) {
            float f48 = hrbVar4.c;
            paint8.setTypeface(hrbVar4.d);
            paint8.setTextSize(hrbVar4.e);
            paint8.setColor(hrbVar4.f);
            sf6 sf6VarB = sf6.b(0.0f, 0.0f);
            hrb.a aVar13 = hrbVar4.G;
            if (aVar13 == aVar8) {
                sf6VarB.b = 0.5f;
                f = 1.0f;
                sf6VarB.c = 1.0f;
                irbVar3.x(canvas4, bibVar4.b.top - f48, sf6VarB);
            } else {
                if (aVar13 == aVar7) {
                    sf6VarB.b = 0.5f;
                    sf6VarB.c = 1.0f;
                    irbVar3.x(canvas4, bibVar4.b.top + f48 + hrbVar4.F, sf6VarB);
                } else if (aVar13 == aVar6) {
                    sf6VarB.b = 0.5f;
                    sf6VarB.c = 0.0f;
                    irbVar3.x(canvas4, bibVar4.b.bottom + f48, sf6VarB);
                } else if (aVar13 == aVar12) {
                    sf6VarB.b = 0.5f;
                    sf6VarB.c = 0.0f;
                    irbVar3.x(canvas4, (bibVar4.b.bottom - f48) - hrbVar4.F, sf6VarB);
                } else {
                    sf6VarB.b = 0.5f;
                    f = 1.0f;
                    sf6VarB.c = 1.0f;
                    irbVar3.x(canvas4, bibVar4.b.top - f48, sf6VarB);
                    sf6VarB.b = 0.5f;
                    sf6VarB.c = 0.0f;
                    irbVar3.x(canvas4, bibVar4.b.bottom + f48, sf6VarB);
                }
                f = 1.0f;
            }
            sf6.c(sf6VarB);
        } else {
            f = 1.0f;
        }
        mj0Var.t0.x(canvas4);
        mj0Var.u0.x(canvas4);
        if (mj0Var.o0) {
            int iSave3 = canvas4.save();
            canvas4.clipRect(mj0Var.L.b);
            mj0Var.J.u(canvas4);
            canvas4.restoreToCount(iSave3);
        } else {
            mj0Var.J.u(canvas4);
        }
        j66 j66Var2 = mj0Var.I;
        Paint.FontMetrics fontMetrics = j66Var2.f;
        Paint paint9 = j66Var2.b;
        bib bibVar5 = (bib) j66Var2.a;
        h66 h66Var = j66Var2.d;
        if (h66Var.a) {
            Typeface typeface = h66Var.d;
            if (typeface != null) {
                paint9.setTypeface(typeface);
            }
            paint9.setTextSize(h66Var.e);
            paint9.setColor(h66Var.f);
            DisplayMetrics displayMetrics = t6b.a;
            paint9.getFontMetrics(fontMetrics);
            float f49 = fontMetrics.descent - fontMetrics.ascent;
            paint9.getFontMetrics(fontMetrics);
            float fC = t6b.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
            float fA = f49 - (t6b.a(paint9, "ABC") / 2.0f);
            i66[] i66VarArr = h66Var.g;
            float fC2 = t6b.c(h66Var.p);
            float fC3 = t6b.c(h66Var.o);
            h66.d dVar = h66Var.j;
            h66.c cVar = h66Var.h;
            h66.e eVar = h66Var.i;
            h66.a aVar14 = h66Var.k;
            float fC4 = t6b.c(h66Var.m);
            float fC5 = t6b.c(h66Var.q);
            float f50 = h66Var.c;
            float f51 = h66Var.b;
            int iOrdinal = cVar.ordinal();
            h66.d dVar2 = h66.d.u;
            h66.a aVar15 = h66.a.t;
            h66.a aVar16 = h66.a.u;
            if (iOrdinal == 0) {
                f2 = dVar == dVar2 ? f51 : bibVar5.b.left + f51;
                if (aVar14 == aVar16) {
                    f2 += h66Var.s;
                }
            } else if (iOrdinal == 1) {
                if (dVar == dVar2) {
                    fWidth = bibVar5.c / 2.0f;
                } else {
                    RectF rectF9 = bibVar5.b;
                    fWidth = (rectF9.width() / 2.0f) + rectF9.left;
                }
                f2 = fWidth + (aVar14 == aVar15 ? f51 : -f51);
                if (dVar == dVar2) {
                    double d = f2;
                    float f52 = h66Var.s;
                    f2 = (float) (d + (aVar14 == aVar15 ? (((double) (-f52)) / 2.0d) + ((double) f51) : (((double) f52) / 2.0d) - ((double) f51)));
                }
            } else if (iOrdinal != 2) {
                f2 = 0.0f;
            } else {
                f2 = (dVar == dVar2 ? bibVar5.c : bibVar5.b.right) - f51;
                if (aVar14 == aVar15) {
                    f2 -= h66Var.s;
                }
            }
            int iOrdinal2 = dVar.ordinal();
            h66.b bVar2 = h66.b.t;
            h66.c cVar2 = h66.c.u;
            if (iOrdinal2 != 0) {
                boolean z7 = true;
                if (iOrdinal2 == 1) {
                    int iOrdinal3 = eVar.ordinal();
                    if (iOrdinal3 == 0) {
                        f9 = (cVar == cVar2 ? 0.0f : bibVar5.b.top) + f50;
                    } else if (iOrdinal3 == 1) {
                        f9 = ((bibVar5.d / 2.0f) - (h66Var.t / 2.0f)) + h66Var.c;
                    } else if (iOrdinal3 != 2) {
                        f9 = 0.0f;
                    } else {
                        f9 = (cVar == cVar2 ? bibVar5.d : bibVar5.b.bottom) - (h66Var.t + f50);
                    }
                    float f53 = f9;
                    float f54 = 0.0f;
                    int i17 = 0;
                    boolean z8 = false;
                    while (i17 < i66VarArr.length) {
                        boolean z9 = z7;
                        i66 i66Var = i66VarArr[i17];
                        h66.b bVar3 = i66Var.b;
                        String str2 = i66Var.a;
                        float f55 = i66Var.c;
                        boolean z10 = bVar3 != bVar2 ? z9 : false;
                        float fC6 = Float.isNaN(f55) ? fC4 : t6b.c(f55);
                        if (z10) {
                            float f56 = aVar14 == aVar15 ? f2 + f54 : f2 - (fC6 - f54);
                            f10 = f2;
                            f11 = f54;
                            z = z9;
                            aVar = aVar14;
                            f12 = f53;
                            str = str2;
                            fMeasureText = f56;
                            j66Var2.u(canvas, fMeasureText, f53 + fA, i66Var, j66Var2.d);
                            j66Var = j66Var2;
                            canvas3 = canvas;
                            if (aVar == aVar15) {
                                fMeasureText += fC6;
                            }
                        } else {
                            f10 = f2;
                            j66Var = j66Var2;
                            aVar = aVar14;
                            f11 = f54;
                            z = z9;
                            canvas3 = canvas;
                            f12 = f53;
                            str = str2;
                            fMeasureText = f10;
                        }
                        if (str != null) {
                            if (z10 && !z8) {
                                fMeasureText += aVar == aVar15 ? fC2 : -fC2;
                            } else if (z8) {
                                fMeasureText = f10;
                            }
                            if (aVar == aVar16) {
                                fMeasureText -= (int) paint9.measureText(str);
                            }
                            if (z8) {
                                float f57 = f49 + fC + f12;
                                canvas3.drawText(str, fMeasureText, f57 + f49, paint9);
                                f14 = f57;
                            } else {
                                canvas3.drawText(str, fMeasureText, f12 + f49, paint9);
                                f14 = f12;
                            }
                            f53 = f49 + fC + f14;
                            f13 = 0.0f;
                        } else {
                            f13 = fC6 + fC5 + f11;
                            z8 = z;
                            f53 = f12;
                        }
                        i17++;
                        aVar14 = aVar;
                        j66Var2 = j66Var;
                        z7 = z;
                        f2 = f10;
                        f54 = f13;
                    }
                }
                f3 = 1.0f;
                mj0Var = this;
            } else {
                float f58 = f2;
                j66 j66Var3 = j66Var2;
                f3 = 1.0f;
                ArrayList arrayList5 = h66Var.w;
                ArrayList arrayList6 = h66Var.u;
                Paint paint10 = paint9;
                ArrayList arrayList7 = h66Var.v;
                int iOrdinal4 = eVar.ordinal();
                if (iOrdinal4 != 0) {
                    f4 = fC3;
                    if (iOrdinal4 != 1) {
                        f5 = iOrdinal4 != 2 ? 0.0f : (bibVar5.d - f50) - h66Var.t;
                    } else {
                        f5 = ((bibVar5.d - h66Var.t) / 2.0f) + f50;
                    }
                } else {
                    f4 = fC3;
                    f5 = f50;
                }
                int length2 = i66VarArr.length;
                float f59 = f58;
                int i18 = 0;
                int i19 = 0;
                while (i18 < length2) {
                    int i20 = length2;
                    i66 i66Var2 = i66VarArr[i18];
                    float f60 = f5;
                    h66.b bVar4 = i66Var2.b;
                    i66[] i66VarArr2 = i66VarArr;
                    String str3 = i66Var2.a;
                    float f61 = i66Var2.c;
                    boolean z11 = bVar4 != bVar2;
                    float fC7 = Float.isNaN(f61) ? fC4 : t6b.c(f61);
                    if (i18 < arrayList7.size() && ((Boolean) arrayList7.get(i18)).booleanValue()) {
                        f60 = f49 + fC + f60;
                        f59 = f58;
                    }
                    if (f59 == f58 && cVar == cVar2 && i19 < arrayList5.size()) {
                        f59 = ((aVar14 == aVar16 ? ((ts3) arrayList5.get(i19)).b : -((ts3) arrayList5.get(i19)).b) / 2.0f) + f59;
                        i19++;
                    }
                    float f62 = f59;
                    int i21 = i19;
                    boolean z12 = str3 == null;
                    if (z11) {
                        if (aVar14 == aVar16) {
                            f62 -= fC7;
                        }
                        arrayList = arrayList5;
                        arrayList2 = arrayList7;
                        f6 = f4;
                        bVar = bVar2;
                        i = i18;
                        float f63 = f62;
                        j66 j66Var4 = j66Var3;
                        j66Var4.u(canvas, f63, f60 + fA, i66Var2, j66Var3.d);
                        j66Var3 = j66Var4;
                        canvas2 = canvas;
                        f62 = aVar14 == aVar15 ? f63 + fC7 : f63;
                    } else {
                        canvas2 = canvas;
                        arrayList = arrayList5;
                        arrayList2 = arrayList7;
                        f6 = f4;
                        bVar = bVar2;
                        i = i18;
                    }
                    if (z12) {
                        paint = paint10;
                        f7 = fC5;
                        f8 = f62 + (aVar14 == aVar16 ? -f7 : f7);
                    } else {
                        if (z11) {
                            f62 += aVar14 == aVar16 ? -fC2 : fC2;
                        }
                        if (aVar14 == aVar16) {
                            f62 -= ((ts3) arrayList6.get(i)).b;
                        }
                        paint = paint10;
                        canvas2.drawText(str3, f62, f60 + f49, paint);
                        if (aVar14 == aVar15) {
                            f62 += ((ts3) arrayList6.get(i)).b;
                        }
                        f8 = f62 + (aVar14 == aVar16 ? -f6 : f6);
                        f7 = fC5;
                    }
                    fC5 = f7;
                    paint10 = paint;
                    i18 = i + 1;
                    bVar2 = bVar;
                    i19 = i21;
                    length2 = i20;
                    i66VarArr = i66VarArr2;
                    arrayList5 = arrayList;
                    f59 = f8;
                    f4 = f6;
                    f5 = f60;
                    arrayList7 = arrayList2;
                }
                mj0Var = this;
            }
        } else {
            f3 = f;
        }
        qy2 qy2Var = mj0Var.D;
        if (qy2Var != null && qy2Var.a) {
            mj0Var.z.setTypeface(qy2Var.d);
            mj0Var.z.setTextSize(mj0Var.D.e);
            mj0Var.z.setColor(mj0Var.D.f);
            mj0Var.z.setTextAlign(mj0Var.D.h);
            float width = mj0Var.getWidth();
            bib bibVar6 = mj0Var.L;
            float f64 = (width - (bibVar6.c - bibVar6.b.right)) - mj0Var.D.b;
            float height = mj0Var.getHeight() - mj0Var.L.h();
            qy2 qy2Var2 = mj0Var.D;
            canvas.drawText(qy2Var2.g, f64, height - qy2Var2.c, mj0Var.z);
        }
        if (mj0Var.V != null && mj0Var.U && (rw4VarArr = mj0Var.S) != null && rw4VarArr.length > 0 && rw4VarArr[0] != null) {
            int i22 = 0;
            while (true) {
                rw4[] rw4VarArr4 = mj0Var.S;
                if (i22 >= rw4VarArr4.length) {
                    break;
                }
                rw4 rw4Var2 = rw4VarArr4[i22];
                t55 t55VarB = mj0Var.u.b(rw4Var2.f);
                qj3 qj3VarE = mj0Var.u.e(mj0Var.S[i22]);
                int iJ = t55VarB.j(qj3VarE);
                if (qj3VarE != null) {
                    float f65 = iJ;
                    float fH3 = t55VarB.H();
                    mj0Var.M.getClass();
                    if (f65 <= fH3 * f3) {
                        float[] fArr6 = {rw4Var2.i, rw4Var2.j};
                        bib bibVar7 = mj0Var.L;
                        float f66 = fArr6[0];
                        float f67 = fArr6[1];
                        if (bibVar7.e(f66) && bibVar7.f(f67)) {
                            mj0Var.V.b(qj3VarE, rw4Var2);
                            mj0Var.V.a(canvas, fArr6[0], fArr6[1]);
                        }
                    }
                }
                i22++;
            }
        }
        if (mj0Var.t) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
            long j2 = mj0Var.y0 + jCurrentTimeMillis2;
            mj0Var.y0 = j2;
            long j3 = mj0Var.z0 + 1;
            mj0Var.z0 = j3;
            StringBuilder sbB = ao3.b("Drawtime: ", jCurrentTimeMillis2, " ms, average: ");
            sbB.append(j2 / j3);
            sbB.append(" ms, cycles: ");
            sbB.append(mj0Var.z0);
            Log.i("MPAndroidChart", sbB.toString());
        }
    }

    @Override // defpackage.va1, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.E0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        boolean z = this.q0;
        mrb.a aVar = mrb.a.t;
        if (z) {
            RectF rectF = this.L.b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            a(aVar).d(fArr);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.q0) {
            bib bibVar = this.L;
            bibVar.i(bibVar.a, this, true);
            return;
        }
        a(aVar).e(fArr);
        bib bibVar2 = this.L;
        Matrix matrix = bibVar2.n;
        matrix.reset();
        matrix.set(bibVar2.a);
        float f = fArr[0];
        RectF rectF2 = bibVar2.b;
        matrix.postTranslate(-(f - rectF2.left), -(fArr[1] - rectF2.top));
        bibVar2.i(matrix, this, true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        db1 db1Var = this.G;
        if (db1Var == null || this.u == 0 || !this.C) {
            return false;
        }
        return ((nj0) db1Var).onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.c0 = z;
    }

    public void setBorderColor(int i) {
        this.l0.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.l0.setStrokeWidth(t6b.c(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.o0 = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.e0 = z;
    }

    public void setDragEnabled(boolean z) {
        this.g0 = z;
        this.h0 = z;
    }

    public void setDragOffsetX(float f) {
        bib bibVar = this.L;
        bibVar.getClass();
        bibVar.l = t6b.c(f);
    }

    public void setDragOffsetY(float f) {
        bib bibVar = this.L;
        bibVar.getClass();
        bibVar.m = t6b.c(f);
    }

    public void setDragXEnabled(boolean z) {
        this.g0 = z;
    }

    public void setDragYEnabled(boolean z) {
        this.h0 = z;
    }

    public void setDrawBorders(boolean z) {
        this.n0 = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.m0 = z;
    }

    public void setGridBackgroundColor(int i) {
        this.k0.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.f0 = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.q0 = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.b0 = i;
    }

    public void setMinOffset(float f) {
        this.p0 = f;
    }

    public void setPinchZoom(boolean z) {
        this.d0 = z;
    }

    public void setRendererLeftYAxis(nrb nrbVar) {
        this.t0 = nrbVar;
    }

    public void setRendererRightYAxis(nrb nrbVar) {
        this.u0 = nrbVar;
    }

    public void setScaleEnabled(boolean z) {
        this.i0 = z;
        this.j0 = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.i0 = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.j0 = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.B.E / f;
        bib bibVar = this.L;
        bibVar.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        bibVar.g = f2;
        bibVar.g(bibVar.a, bibVar.b);
    }

    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.B.E / f;
        bib bibVar = this.L;
        bibVar.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        bibVar.h = f2;
        bibVar.g(bibVar.a, bibVar.b);
    }

    public void setXAxisRenderer(irb irbVar) {
        this.x0 = irbVar;
    }

    public void setOnDrawListener(kh7 kh7Var) {
    }
}
