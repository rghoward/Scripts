package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.charts.BarChart;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class fj0 extends qj0 {
    public final BarChart f;
    public final RectF g;
    public dj0[] h;
    public final Paint i;
    public final Paint j;
    public final RectF k;

    public fj0(BarChart barChart, wa1 wa1Var, bib bibVar) {
        super(bibVar);
        this.b = wa1Var;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.e = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(t6b.c(9.0f));
        Paint paint3 = new Paint(1);
        this.d = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        this.d.setStrokeWidth(2.0f);
        this.d.setColor(Color.rgb(255, 187, 115));
        this.g = new RectF();
        this.k = new RectF();
        this.f = barChart;
        Paint paint4 = new Paint(1);
        this.d = paint4;
        paint4.setStyle(style);
        this.d.setColor(Color.rgb(0, 0, 0));
        this.d.setAlpha(120);
        Paint paint5 = new Paint(1);
        this.i = paint5;
        paint5.setStyle(style);
        Paint paint6 = new Paint(1);
        this.j = paint6;
        paint6.setStyle(style2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ff2
    public void u(Canvas canvas) {
        sf6 sf6Var;
        Paint paint;
        BarChart barChart;
        nab nabVar;
        int i;
        float[] fArr;
        wa1 wa1Var;
        ova ovaVar;
        float f;
        Paint paint2;
        wa1 wa1Var2;
        BarChart barChart2;
        int i2;
        fj0 fj0Var = this;
        Paint paint3 = fj0Var.e;
        wa1 wa1Var3 = fj0Var.b;
        bib bibVar = (bib) fj0Var.a;
        BarChart barChart3 = fj0Var.f;
        if (((float) barChart3.getData().d()) < ((float) barChart3.getMaxVisibleCount()) * ((bib) fj0Var.a).i) {
            ArrayList arrayList = barChart3.getBarData().i;
            float fC = t6b.c(4.5f);
            boolean z = barChart3.G0;
            int i3 = 0;
            while (i3 < barChart3.getBarData().c()) {
                q55 q55Var = (q55) arrayList.get(i3);
                if (q55Var.isVisible() && (q55Var.C() || q55Var.f())) {
                    paint3.setTypeface(null);
                    paint3.setTextSize(q55Var.k());
                    barChart3.h(q55Var.G());
                    float fA = t6b.a(paint3, "8");
                    float f2 = z ? -fC : fA + fC;
                    float f3 = z ? fA + fC : -fC;
                    dj0 dj0Var = fj0Var.h[i3];
                    wa1Var3.getClass();
                    nab nabVarL = q55Var.l();
                    sf6 sf6VarI = q55Var.I();
                    sf6 sf6Var2 = (sf6) sf6.d.b();
                    float f4 = sf6VarI.b;
                    sf6Var2.b = f4;
                    sf6Var2.c = sf6VarI.c;
                    sf6Var2.b = t6b.c(f4);
                    sf6Var2.c = t6b.c(sf6Var2.c);
                    if (q55Var.B()) {
                        nab nabVar2 = nabVarL;
                        sf6Var = sf6Var2;
                        ova ovaVarA = barChart3.a(q55Var.G());
                        int i4 = 0;
                        int length = 0;
                        while (i4 < q55Var.H() * 1.0f) {
                            kj0 kj0Var = (kj0) q55Var.o(i4);
                            float[] fArr2 = kj0Var.w;
                            float[] fArr3 = dj0Var.b;
                            float f5 = (fArr3[length] + fArr3[length + 2]) / 2.0f;
                            int iU = q55Var.u(i4);
                            if (fArr2 != null) {
                                paint = paint3;
                                barChart = barChart3;
                                nabVar = nabVar2;
                                i = i4;
                                fArr = fArr2;
                                wa1Var = wa1Var3;
                                ovaVar = ovaVarA;
                                int length2 = fArr.length * 2;
                                float[] fArr4 = new float[length2];
                                float f6 = -kj0Var.y;
                                float f7 = 0.0f;
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < length2) {
                                    float f8 = fArr[i6];
                                    if (f8 == 0.0f && (f7 == 0.0f || f6 == 0.0f)) {
                                        f = f6;
                                        f6 = f8;
                                    } else if (f8 >= 0.0f) {
                                        f7 += f8;
                                        f = f6;
                                        f6 = f7;
                                    } else {
                                        f = f6 - f8;
                                    }
                                    fArr4[i5 + 1] = f6 * 1.0f;
                                    i5 += 2;
                                    i6++;
                                    f6 = f;
                                }
                                ovaVar.e(fArr4);
                                int i7 = 0;
                                while (i7 < length2) {
                                    float f9 = fArr[i7 / 2];
                                    int i8 = length2;
                                    float f10 = fArr4[i7 + 1] + (((f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1)) == 0 && (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)) == 0 && (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)) > 0) || (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1)) < 0 ? f3 : f2);
                                    if (!bibVar.d(f5)) {
                                        break;
                                    }
                                    if (bibVar.f(f10) && bibVar.c(f5) && q55Var.C()) {
                                        w(canvas, nabVar.a(f9), f5, f10, iU);
                                    }
                                    i7 += 2;
                                    fArr4 = fArr4;
                                    length2 = i8;
                                }
                            } else {
                                if (!bibVar.d(f5)) {
                                    break;
                                }
                                int i9 = length + 1;
                                ova ovaVar2 = ovaVarA;
                                if (!bibVar.f(fArr3[i9]) || !bibVar.c(f5)) {
                                    paint = paint3;
                                    ovaVarA = ovaVar2;
                                    i4 = i4;
                                    wa1Var3 = wa1Var3;
                                    barChart3 = barChart3;
                                    nabVar2 = nabVar2;
                                } else if (q55Var.C()) {
                                    nabVar2.getClass();
                                    paint = paint3;
                                    nabVar = nabVar2;
                                    String strA = nabVar.a(kj0Var.t);
                                    float f11 = fArr3[i9];
                                    i = i4;
                                    barChart = barChart3;
                                    fArr = fArr2;
                                    wa1Var = wa1Var3;
                                    ovaVar = ovaVar2;
                                    w(canvas, strA, f5, f11 + (kj0Var.t >= 0.0f ? f2 : f3), iU);
                                } else {
                                    paint = paint3;
                                    wa1Var = wa1Var3;
                                    barChart = barChart3;
                                    nabVar = nabVar2;
                                    ovaVar = ovaVar2;
                                    i = i4;
                                    fArr = fArr2;
                                }
                                paint3 = paint;
                            }
                            length = fArr == null ? length + 4 : (fArr.length * 4) + length;
                            i4 = i + 1;
                            nabVar2 = nabVar;
                            ovaVarA = ovaVar;
                            wa1Var3 = wa1Var;
                            barChart3 = barChart;
                            paint3 = paint;
                        }
                    } else {
                        int i10 = 0;
                        while (true) {
                            float f12 = i10;
                            float[] fArr5 = dj0Var.b;
                            if (f12 >= fArr5.length * 1.0f) {
                                break;
                            }
                            float f13 = (fArr5[i10] + fArr5[i10 + 2]) / 2.0f;
                            if (!bibVar.d(f13)) {
                                break;
                            }
                            int i11 = i10 + 1;
                            dj0 dj0Var2 = dj0Var;
                            if (bibVar.f(fArr5[i11]) && bibVar.c(f13)) {
                                int i12 = i10 / 4;
                                kj0 kj0Var2 = (kj0) q55Var.o(i12);
                                int i13 = i10;
                                float f14 = kj0Var2.t;
                                if (q55Var.C()) {
                                    nabVarL.getClass();
                                    i2 = i13;
                                    w(canvas, nabVarL.a(kj0Var2.t), f13, f14 >= 0.0f ? fArr5[i11] + f2 : fArr5[i13 + 3] + f3, q55Var.u(i12));
                                } else {
                                    i2 = i13;
                                }
                            } else {
                                i2 = i10;
                            }
                            i10 = i2 + 4;
                            q55Var = q55Var;
                            dj0Var = dj0Var2;
                            nabVarL = nabVarL;
                            sf6Var2 = sf6Var2;
                        }
                        sf6Var = sf6Var2;
                    }
                    paint2 = paint3;
                    wa1Var2 = wa1Var3;
                    barChart2 = barChart3;
                    sf6.c(sf6Var);
                } else {
                    paint2 = paint3;
                    wa1Var2 = wa1Var3;
                    barChart2 = barChart3;
                }
                i3++;
                fj0Var = this;
                wa1Var3 = wa1Var2;
                barChart3 = barChart2;
                paint3 = paint2;
            }
        }
    }

    @Override // defpackage.ff2
    public void v() {
        hj0 barData = this.f.getBarData();
        this.h = new dj0[barData.c()];
        for (int i = 0; i < this.h.length; i++) {
            q55 q55Var = (q55) barData.b(i);
            dj0[] dj0VarArr = this.h;
            int iH = q55Var.H() * 4;
            int iW = q55Var.B() ? q55Var.w() : 1;
            barData.c();
            dj0VarArr[i] = new dj0(iH * iW, q55Var.B());
        }
    }

    public void w(Canvas canvas, String str, float f, float f2, int i) {
        Paint paint = this.e;
        paint.setColor(i);
        canvas.drawText(str, f, f2, paint);
    }
}
