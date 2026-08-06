package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import com.intercom.twig.BuildConfig;
import defpackage.bib;
import defpackage.fj0;
import defpackage.h66;
import defpackage.hj0;
import defpackage.hrb;
import defpackage.i66;
import defpackage.ij0;
import defpackage.irb;
import defpackage.iv2;
import defpackage.j66;
import defpackage.lj0;
import defpackage.mj0;
import defpackage.mrb;
import defpackage.nj0;
import defpackage.nrb;
import defpackage.ova;
import defpackage.qy2;
import defpackage.rf6;
import defpackage.rw4;
import defpackage.sf6;
import defpackage.t6b;
import defpackage.wa1;
import defpackage.ya1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class BarChart extends mj0<hj0> implements ij0 {
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;

    public BarChart(Context context) {
        super(context);
        this.t = false;
        this.u = null;
        this.v = true;
        this.w = true;
        this.x = 0.9f;
        this.y = new iv2(0);
        this.C = true;
        this.H = "No chart data available.";
        this.L = new bib();
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = false;
        this.T = 0.0f;
        this.U = true;
        this.W = new ArrayList<>();
        this.a0 = false;
        i();
        this.b0 = 100;
        this.c0 = false;
        this.d0 = false;
        this.e0 = true;
        this.f0 = true;
        this.g0 = true;
        this.h0 = true;
        this.i0 = true;
        this.j0 = true;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.p0 = 15.0f;
        this.q0 = false;
        this.y0 = 0L;
        this.z0 = 0L;
        this.A0 = new RectF();
        this.B0 = new Matrix();
        new Matrix();
        this.C0 = rf6.b(0.0d, 0.0d);
        this.D0 = rf6.b(0.0d, 0.0d);
        this.E0 = new float[2];
        this.F0 = false;
        this.G0 = true;
        this.H0 = false;
        this.I0 = false;
    }

    @Override // defpackage.va1
    public rw4 c(float f, float f2) {
        if (this.u == 0) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        rw4 rw4VarA = getHighlighter().a(f, f2);
        return (rw4VarA == null || !this.F0) ? rw4VarA : new rw4(rw4VarA.a, rw4VarA.b, rw4VarA.c, rw4VarA.d, rw4VarA.f, -1, rw4VarA.h);
    }

    @Override // defpackage.mj0
    public final void g() {
        boolean z = this.I0;
        hrb hrbVar = this.B;
        if (z) {
            T t = this.u;
            hrbVar.a(((hj0) t).d - (((hj0) t).j / 2.0f), (((hj0) t).j / 2.0f) + ((hj0) t).c);
        } else {
            T t2 = this.u;
            hrbVar.a(((hj0) t2).d, ((hj0) t2).c);
        }
        mrb mrbVar = this.r0;
        hj0 hj0Var = (hj0) this.u;
        mrb.a aVar = mrb.a.t;
        mrbVar.a(hj0Var.g(aVar), ((hj0) this.u).f(aVar));
        mrb mrbVar2 = this.s0;
        hj0 hj0Var2 = (hj0) this.u;
        mrb.a aVar2 = mrb.a.u;
        mrbVar2.a(hj0Var2.g(aVar2), ((hj0) this.u).f(aVar2));
    }

    @Override // defpackage.ij0
    public hj0 getBarData() {
        return (hj0) this.u;
    }

    public void i() {
        setWillNotDraw(false);
        this.M = new wa1();
        Context context = getContext();
        DisplayMetrics displayMetrics = t6b.a;
        if (context == null) {
            t6b.b = ViewConfiguration.getMinimumFlingVelocity();
            t6b.c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            t6b.b = viewConfiguration.getScaledMinimumFlingVelocity();
            t6b.c = viewConfiguration.getScaledMaximumFlingVelocity();
            t6b.a = context.getResources().getDisplayMetrics();
        }
        this.T = t6b.c(500.0f);
        qy2 qy2Var = new qy2();
        qy2Var.g = "Description Label";
        qy2Var.h = Paint.Align.RIGHT;
        qy2Var.e = t6b.c(8.0f);
        this.D = qy2Var;
        h66 h66Var = new h66();
        h66Var.g = new i66[0];
        h66Var.h = h66.c.t;
        h66Var.i = h66.e.t;
        h66Var.j = h66.d.t;
        h66Var.k = h66.a.t;
        h66Var.l = h66.b.v;
        h66Var.m = 8.0f;
        h66Var.n = 3.0f;
        h66Var.o = 6.0f;
        h66Var.p = 5.0f;
        h66Var.q = 3.0f;
        h66Var.r = 0.95f;
        h66Var.s = 0.0f;
        h66Var.t = 0.0f;
        h66Var.u = new ArrayList(16);
        h66Var.v = new ArrayList(16);
        h66Var.w = new ArrayList(16);
        h66Var.e = t6b.c(10.0f);
        h66Var.b = t6b.c(5.0f);
        h66Var.c = t6b.c(3.0f);
        this.E = h66Var;
        j66 j66Var = new j66(this.L);
        j66Var.e = new ArrayList(16);
        j66Var.f = new Paint.FontMetrics();
        j66Var.g = new Path();
        j66Var.d = h66Var;
        Paint paint = new Paint(1);
        j66Var.b = paint;
        paint.setTextSize(t6b.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        j66Var.c = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.I = j66Var;
        hrb hrbVar = new hrb();
        hrbVar.F = 1;
        hrbVar.G = hrb.a.t;
        hrbVar.c = t6b.c(4.0f);
        this.B = hrbVar;
        this.z = new Paint(1);
        Paint paint3 = new Paint(1);
        this.A = paint3;
        paint3.setColor(Color.rgb(247, 189, 51));
        this.A.setTextAlign(Paint.Align.CENTER);
        this.A.setTextSize(t6b.c(12.0f));
        if (this.t) {
            Log.i(BuildConfig.FLAVOR, "Chart.init()");
        }
        this.r0 = new mrb(mrb.a.t);
        this.s0 = new mrb(mrb.a.u);
        this.v0 = new ova(this.L);
        this.w0 = new ova(this.L);
        this.t0 = new nrb(this.L, this.r0, this.v0);
        this.u0 = new nrb(this.L, this.s0, this.w0);
        this.x0 = new irb(this.L, this.B, this.v0);
        setHighlighter(new ya1(this));
        Matrix matrix = this.L.a;
        nj0 nj0Var = new nj0();
        nj0Var.t = 0;
        nj0Var.w = this;
        nj0Var.v = new GestureDetector(getContext(), nj0Var);
        nj0Var.x = new Matrix();
        nj0Var.y = new Matrix();
        nj0Var.z = sf6.b(0.0f, 0.0f);
        nj0Var.A = sf6.b(0.0f, 0.0f);
        nj0Var.B = 1.0f;
        nj0Var.C = 1.0f;
        nj0Var.D = 1.0f;
        nj0Var.G = 0L;
        nj0Var.H = sf6.b(0.0f, 0.0f);
        nj0Var.I = sf6.b(0.0f, 0.0f);
        nj0Var.x = matrix;
        nj0Var.J = t6b.c(3.0f);
        nj0Var.K = t6b.c(3.5f);
        this.G = nj0Var;
        Paint paint4 = new Paint();
        this.k0 = paint4;
        paint4.setStyle(style);
        this.k0.setColor(Color.rgb(240, 240, 240));
        Paint paint5 = new Paint();
        this.l0 = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        this.l0.setColor(-16777216);
        this.l0.setStrokeWidth(t6b.c(1.0f));
        this.J = new fj0(this, this.M, this.L);
        setHighlighter(new lj0(this));
        getXAxis().y = 0.5f;
        getXAxis().z = 0.5f;
    }

    public void setDrawBarShadow(boolean z) {
        this.H0 = z;
    }

    public void setDrawValueAboveBar(boolean z) {
        this.G0 = z;
    }

    public void setFitBars(boolean z) {
        this.I0 = z;
    }

    public void setHighlightFullBarEnabled(boolean z) {
        this.F0 = z;
    }

    public BarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = false;
        this.u = null;
        this.v = true;
        this.w = true;
        this.x = 0.9f;
        this.y = new iv2(0);
        this.C = true;
        this.H = "No chart data available.";
        this.L = new bib();
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = false;
        this.T = 0.0f;
        this.U = true;
        this.W = new ArrayList<>();
        this.a0 = false;
        i();
        this.b0 = 100;
        this.c0 = false;
        this.d0 = false;
        this.e0 = true;
        this.f0 = true;
        this.g0 = true;
        this.h0 = true;
        this.i0 = true;
        this.j0 = true;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.p0 = 15.0f;
        this.q0 = false;
        this.y0 = 0L;
        this.z0 = 0L;
        this.A0 = new RectF();
        this.B0 = new Matrix();
        new Matrix();
        this.C0 = rf6.b(0.0d, 0.0d);
        this.D0 = rf6.b(0.0d, 0.0d);
        this.E0 = new float[2];
        this.F0 = false;
        this.G0 = true;
        this.H0 = false;
        this.I0 = false;
    }

    public BarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = false;
        this.u = null;
        this.v = true;
        this.w = true;
        this.x = 0.9f;
        this.y = new iv2(0);
        this.C = true;
        this.H = "No chart data available.";
        this.L = new bib();
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = 0.0f;
        this.R = false;
        this.T = 0.0f;
        this.U = true;
        this.W = new ArrayList<>();
        this.a0 = false;
        i();
        this.b0 = 100;
        this.c0 = false;
        this.d0 = false;
        this.e0 = true;
        this.f0 = true;
        this.g0 = true;
        this.h0 = true;
        this.i0 = true;
        this.j0 = true;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.p0 = 15.0f;
        this.q0 = false;
        this.y0 = 0L;
        this.z0 = 0L;
        this.A0 = new RectF();
        this.B0 = new Matrix();
        new Matrix();
        this.C0 = rf6.b(0.0d, 0.0d);
        this.D0 = rf6.b(0.0d, 0.0d);
        this.E0 = new float[2];
        this.F0 = false;
        this.G0 = true;
        this.H0 = false;
        this.I0 = false;
    }
}
