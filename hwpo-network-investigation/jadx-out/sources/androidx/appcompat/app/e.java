package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.hwpo_training_app.R;
import defpackage.egb;
import defpackage.fib;
import defpackage.rz;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends rz implements DialogInterface {
    public final AlertController z;

    public e(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, g(contextThemeWrapper, i));
        this.z = new AlertController(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button f(int i) {
        AlertController alertController = this.z;
        if (i == -3) {
            return alertController.w;
        }
        if (i == -2) {
            return alertController.s;
        }
        if (i == -1) {
            return alertController.o;
        }
        alertController.getClass();
        return null;
    }

    @Override // defpackage.rz, defpackage.oq1, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View view;
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.z;
        alertController.b.setContentView(alertController.J);
        Context context = alertController.a;
        Window window = alertController.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View viewInflate = alertController.h;
        if (viewInflate == null) {
            viewInflate = alertController.i != 0 ? LayoutInflater.from(context).inflate(alertController.i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.a(viewInflate)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
            }
            if (alertController.g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = AlertController.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = AlertController.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = AlertController.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        int i3 = alertController.d;
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        alertController.o = button;
        AlertController.a aVar = alertController.Q;
        button.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.p) && alertController.r == null) {
            alertController.o.setVisibility(8);
            i = 0;
        } else {
            alertController.o.setText(alertController.p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        alertController.s = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.t) && alertController.v == null) {
            alertController.s.setVisibility(8);
        } else {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        alertController.w = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.x) && alertController.z == null) {
            alertController.w.setVisibility(8);
            view = null;
        } else {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                view = null;
                alertController.w.setCompoundDrawables(alertController.z, null, null, null);
            } else {
                view = null;
            }
            alertController.w.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = alertController.o;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = alertController.s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = alertController.w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (alertController.G != null) {
            viewGroupB.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(alertController.e) || !alertController.O) {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.e);
                int i4 = alertController.B;
                if (i4 != 0) {
                    alertController.D.setImageResource(i4);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f == null && alertController.g == null) ? view : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            i2 = 0;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            i2 = 0;
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.g;
        if (recycleListView != null && (!z3 || i5 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i5 != 0 ? recycleListView.getPaddingTop() : recycleListView.t, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.u);
        }
        if (!z2) {
            View view2 = alertController.g;
            if (view2 == null) {
                view2 = alertController.A;
            }
            if (view2 != null) {
                int i6 = z3 ? 2 : i2;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, fib> weakHashMap = egb.a;
                view2.setScrollIndicators(i5 | i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.g;
        if (recycleListView2 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i7 = alertController.I;
        if (i7 > -1) {
            recycleListView2.setItemChecked(i7, true);
            recycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.z.A;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.z.A;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.rz, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.z;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a {
        private final AlertController.b P;
        private final int mTheme;

        public a(Context context, int i) {
            this.P = new AlertController.b(new ContextThemeWrapper(context, e.g(context, i)));
            this.mTheme = i;
        }

        public e create() {
            AlertController.RecycleListView recycleListView;
            ListAdapter simpleCursorAdapter;
            e eVar = new e(this.P.a, this.mTheme);
            AlertController.b bVar = this.P;
            View view = bVar.f;
            ContextThemeWrapper contextThemeWrapper = bVar.a;
            AlertController alertController = eVar.z;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.e;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.d;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i = bVar.c;
                if (i != 0) {
                    alertController.C = null;
                    alertController.B = i;
                    ImageView imageView2 = alertController.D;
                    if (imageView2 != null) {
                        if (i != 0) {
                            imageView2.setVisibility(0);
                            alertController.D.setImageResource(alertController.B);
                        } else {
                            imageView2.setVisibility(8);
                        }
                    }
                }
            }
            CharSequence charSequence2 = bVar.g;
            if (charSequence2 != null) {
                alertController.f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.h;
            if (charSequence3 != null || bVar.i != null) {
                alertController.c(-1, charSequence3, bVar.j, bVar.i);
            }
            CharSequence charSequence4 = bVar.k;
            if (charSequence4 != null || bVar.l != null) {
                alertController.c(-2, charSequence4, bVar.m, bVar.l);
            }
            CharSequence charSequence5 = bVar.n;
            if (charSequence5 != null || bVar.o != null) {
                alertController.c(-3, charSequence5, bVar.p, bVar.o);
            }
            if (bVar.u != null || bVar.J != null || bVar.v != null) {
                AlertController.RecycleListView recycleListView2 = (AlertController.RecycleListView) bVar.b.inflate(alertController.K, (ViewGroup) null);
                if (!bVar.F) {
                    recycleListView = recycleListView2;
                    int i2 = bVar.G ? alertController.M : alertController.N;
                    if (bVar.J != null) {
                        simpleCursorAdapter = new SimpleCursorAdapter(contextThemeWrapper, i2, bVar.J, new String[]{bVar.K}, new int[]{android.R.id.text1});
                    } else {
                        ListAdapter dVar = bVar.v;
                        if (dVar == null) {
                            dVar = new AlertController.d(contextThemeWrapper, i2, android.R.id.text1, bVar.u);
                        }
                        simpleCursorAdapter = dVar;
                    }
                } else if (bVar.J == null) {
                    simpleCursorAdapter = new androidx.appcompat.app.a(bVar, contextThemeWrapper, alertController.L, bVar.u, recycleListView2);
                    recycleListView = recycleListView2;
                } else {
                    simpleCursorAdapter = new b(bVar, contextThemeWrapper, bVar.J, recycleListView2, alertController);
                    recycleListView = recycleListView2;
                }
                alertController.H = simpleCursorAdapter;
                alertController.I = bVar.H;
                if (bVar.w != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                } else if (bVar.I != null) {
                    recycleListView.setOnItemClickListener(new d(bVar, recycleListView, alertController));
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.M;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (bVar.G) {
                    recycleListView.setChoiceMode(1);
                } else if (bVar.F) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.g = recycleListView;
            }
            View view2 = bVar.y;
            if (view2 == null) {
                int i3 = bVar.x;
                if (i3 != 0) {
                    alertController.h = null;
                    alertController.i = i3;
                    alertController.n = false;
                }
            } else if (bVar.D) {
                int i4 = bVar.z;
                int i5 = bVar.A;
                int i6 = bVar.B;
                int i7 = bVar.C;
                alertController.h = view2;
                alertController.i = 0;
                alertController.n = true;
                alertController.j = i4;
                alertController.k = i5;
                alertController.l = i6;
                alertController.m = i7;
            } else {
                alertController.h = view2;
                alertController.i = 0;
                alertController.n = false;
            }
            eVar.setCancelable(this.P.q);
            if (this.P.q) {
                eVar.setCanceledOnTouchOutside(true);
            }
            eVar.setOnCancelListener(this.P.r);
            eVar.setOnDismissListener(this.P.s);
            DialogInterface.OnKeyListener onKeyListener = this.P.t;
            if (onKeyListener != null) {
                eVar.setOnKeyListener(onKeyListener);
            }
            return eVar;
        }

        public Context getContext() {
            return this.P.a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = listAdapter;
            bVar.w = onClickListener;
            return this;
        }

        public a setCancelable(boolean z) {
            this.P.q = z;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.K = str;
            bVar.w = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.P.f = view;
            return this;
        }

        public a setIcon(int i) {
            this.P.c = i;
            return this;
        }

        public a setIconAttribute(int i) {
            TypedValue typedValue = new TypedValue();
            this.P.a.getTheme().resolveAttribute(i, typedValue, true);
            this.P.c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z) {
            this.P.getClass();
            return this;
        }

        public a setItems(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = bVar.a.getResources().getTextArray(i);
            this.P.w = onClickListener;
            return this;
        }

        public a setMessage(int i) {
            AlertController.b bVar = this.P;
            bVar.g = bVar.a.getText(i);
            return this;
        }

        public a setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = bVar.a.getResources().getTextArray(i);
            AlertController.b bVar2 = this.P;
            bVar2.I = onMultiChoiceClickListener;
            bVar2.E = zArr;
            bVar2.F = true;
            return this;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.k = bVar.a.getText(i);
            this.P.m = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.P.l = drawable;
            return this;
        }

        public a setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.n = bVar.a.getText(i);
            this.P.p = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.P.o = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.r = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.s = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.M = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.t = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.h = bVar.a.getText(i);
            this.P.j = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.P.i = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z) {
            this.P.getClass();
            return this;
        }

        public a setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = bVar.a.getResources().getTextArray(i);
            AlertController.b bVar2 = this.P;
            bVar2.w = onClickListener;
            bVar2.H = i2;
            bVar2.G = true;
            return this;
        }

        public a setTitle(int i) {
            AlertController.b bVar = this.P;
            bVar.e = bVar.a.getText(i);
            return this;
        }

        @Deprecated
        public a setView(View view, int i, int i2, int i3, int i4) {
            AlertController.b bVar = this.P;
            bVar.y = view;
            bVar.x = 0;
            bVar.D = true;
            bVar.z = i;
            bVar.A = i2;
            bVar.B = i3;
            bVar.C = i4;
            return this;
        }

        public e show() {
            e eVarCreate = create();
            eVarCreate.show();
            return eVarCreate;
        }

        public a setIcon(Drawable drawable) {
            this.P.d = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.P.g = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.P.e = charSequence;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.k = charSequence;
            bVar.m = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.n = charSequence;
            bVar.p = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.h = charSequence;
            bVar.j = onClickListener;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = charSequenceArr;
            bVar.w = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.P;
            bVar.y = view;
            bVar.x = 0;
            bVar.D = false;
            return this;
        }

        public a(Context context) {
            this(context, e.g(context, 0));
        }

        public a setView(int i) {
            AlertController.b bVar = this.P;
            bVar.y = null;
            bVar.x = i;
            bVar.D = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = charSequenceArr;
            bVar.I = onMultiChoiceClickListener;
            bVar.E = zArr;
            bVar.F = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.w = onClickListener;
            bVar.H = i;
            bVar.K = str;
            bVar.G = true;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.I = onMultiChoiceClickListener;
            bVar.L = str;
            bVar.K = str2;
            bVar.F = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = charSequenceArr;
            bVar.w = onClickListener;
            bVar.H = i;
            bVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = listAdapter;
            bVar.w = onClickListener;
            bVar.H = i;
            bVar.G = true;
            return this;
        }
    }
}
