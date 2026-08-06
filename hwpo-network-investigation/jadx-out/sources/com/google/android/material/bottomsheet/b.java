package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.hwpo_training_app.R;
import defpackage.anb;
import defpackage.bnb;
import defpackage.cu0;
import defpackage.dnb;
import defpackage.du0;
import defpackage.egb;
import defpackage.eu0;
import defpackage.f83;
import defpackage.fib;
import defpackage.g53;
import defpackage.hj6;
import defpackage.jmb;
import defpackage.kk6;
import defpackage.rz;
import defpackage.umb;
import defpackage.x10;
import defpackage.yv9;
import defpackage.zmb;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class b extends rz {
    public FrameLayout A;
    public CoordinatorLayout B;
    public FrameLayout C;
    public boolean D;
    public boolean E;
    public boolean F;
    public C0051b G;
    public boolean H;
    public hj6 I;
    public final a J;
    public BottomSheetBehavior<FrameLayout> z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class C0051b extends BottomSheetBehavior.d {
        public final Boolean a;
        public final umb b;
        public Window c;
        public boolean d;

        public C0051b(View view, umb umbVar) {
            this.b = umbVar;
            kk6 kk6Var = BottomSheetBehavior.C(view).C;
            ColorStateList backgroundTintList = kk6Var != null ? kk6Var.u.c : view.getBackgroundTintList();
            if (backgroundTintList != null) {
                this.a = Boolean.valueOf(g53.c(backgroundTintList.getDefaultColor()));
                return;
            }
            ColorStateList colorStateListA = f83.a(view.getBackground());
            Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
            if (numValueOf != null) {
                this.a = Boolean.valueOf(g53.c(numValueOf.intValue()));
            } else {
                this.a = null;
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            d(view);
        }

        public final void d(View view) {
            x10 anbVar;
            x10 anbVar2;
            int top = view.getTop();
            umb umbVar = this.b;
            if (top < umbVar.d()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.a;
                    boolean zBooleanValue = bool == null ? this.d : bool.booleanValue();
                    yv9 yv9Var = new yv9(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 35) {
                        anbVar2 = new dnb(window, yv9Var);
                    } else if (i >= 30) {
                        anbVar2 = new bnb(window, yv9Var);
                    } else {
                        anbVar2 = i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
                    }
                    anbVar2.h(zBooleanValue);
                }
                view.setPadding(view.getPaddingLeft(), umbVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    boolean z = this.d;
                    yv9 yv9Var2 = new yv9(window2.getDecorView());
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        anbVar = new dnb(window2, yv9Var2);
                    } else if (i2 >= 30) {
                        anbVar = new bnb(window2, yv9Var2);
                    } else {
                        anbVar = i2 >= 26 ? new anb(window2, yv9Var2) : new zmb(window2, yv9Var2);
                    }
                    anbVar.h(z);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public final void e(Window window) {
            x10 anbVar;
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                yv9 yv9Var = new yv9(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    anbVar = new dnb(window, yv9Var);
                } else if (i >= 30) {
                    anbVar = new bnb(window, yv9Var);
                } else {
                    anbVar = i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
                }
                this.d = anbVar.c();
            }
        }
    }

    public b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.D = true;
        this.E = true;
        this.J = new a();
        d().v(1);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.H = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.z == null) {
            f();
        }
        super.cancel();
    }

    public final void f() {
        if (this.A == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.A = frameLayout;
            this.B = (CoordinatorLayout) this.A.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.A.findViewById(R.id.design_bottom_sheet);
            this.C = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorC = BottomSheetBehavior.C(frameLayout2);
            this.z = bottomSheetBehaviorC;
            ArrayList<BottomSheetBehavior.d> arrayList = bottomSheetBehaviorC.t0;
            a aVar = this.J;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
            this.z.J(this.D);
            this.I = new hj6(this.z, this.C);
        }
    }

    public final FrameLayout g(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.A.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.H) {
            FrameLayout frameLayout = this.A;
            com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
            WeakHashMap<View, fib> weakHashMap = egb.a;
            egb.d.c(frameLayout, aVar);
        }
        this.C.removeAllViews();
        FrameLayout frameLayout2 = this.C;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new cu0(this));
        egb.o(this.C, new du0(this));
        this.C.setOnTouchListener(new eu0());
        return this.A;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.H) {
                if (Color.alpha(Build.VERSION.SDK_INT < 35 ? window.getNavigationBarColor() : 0) < 255) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.B;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            jmb.a(window, !z);
            C0051b c0051b = this.G;
            if (c0051b != null) {
                c0051b.e(window);
            }
        }
        hj6 hj6Var = this.I;
        if (hj6Var == null) {
            return;
        }
        View view = hj6Var.c;
        boolean z2 = this.D;
        hj6.a aVar = hj6Var.a;
        if (z2) {
            if (aVar != null) {
                aVar.b(hj6Var.b, view, false);
            }
        } else if (aVar != null) {
            aVar.c(view);
        }
    }

    @Override // defpackage.rz, defpackage.oq1, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        hj6.a aVar;
        C0051b c0051b = this.G;
        if (c0051b != null) {
            c0051b.e(null);
        }
        hj6 hj6Var = this.I;
        if (hj6Var == null || (aVar = hj6Var.a) == null) {
            return;
        }
        aVar.c(hj6Var.c);
    }

    @Override // defpackage.oq1, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.z;
        if (bottomSheetBehavior == null || bottomSheetBehavior.i0 != 5) {
            return;
        }
        bottomSheetBehavior.L(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        hj6 hj6Var;
        super.setCancelable(z);
        if (this.D != z) {
            this.D = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.z;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.J(z);
            }
            if (getWindow() == null || (hj6Var = this.I) == null) {
                return;
            }
            View view = hj6Var.c;
            boolean z2 = this.D;
            hj6.a aVar = hj6Var.a;
            if (z2) {
                if (aVar != null) {
                    aVar.b(hj6Var.b, view, false);
                }
            } else if (aVar != null) {
                aVar.c(view);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.D) {
            this.D = true;
        }
        this.E = z;
        this.F = true;
    }

    @Override // defpackage.rz, defpackage.oq1, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(g(view, 0, null));
    }

    @Override // defpackage.rz, defpackage.oq1, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(g(null, i, null));
    }

    @Override // defpackage.rz, defpackage.oq1, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends BottomSheetBehavior.d {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            if (i == 5) {
                b.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view) {
        }
    }
}
