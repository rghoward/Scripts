package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import androidx.fragment.app.l;
import com.google.android.material.internal.CheckableImageButton;
import com.hwpo_training_app.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class gk6<S> extends e {
    public final LinkedHashSet<ik6<? super S>> J = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> K = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> L = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> M = new LinkedHashSet<>();
    public int N;
    public wk2<S> O;
    public yy7<S> P;
    public a21 Q;
    public am2 R;
    public rj6<S> S;
    public int T;
    public CharSequence U;
    public boolean V;
    public int W;
    public int X;
    public CharSequence Y;
    public int Z;
    public CharSequence a0;
    public int b0;
    public CharSequence c0;
    public int d0;
    public CharSequence e0;
    public TextView f0;
    public TextView g0;
    public CheckableImageButton h0;
    public kk6 i0;
    public Button j0;
    public boolean k0;
    public CharSequence l0;
    public CharSequence m0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a extends ai7<S> {
        public a() {
        }

        @Override // defpackage.ai7
        public final void a() {
            gk6.this.j0.setEnabled(false);
        }

        @Override // defpackage.ai7
        public final void b(S s) {
            gk6 gk6Var = gk6.this;
            String strE = gk6Var.p().e(gk6Var.getContext());
            gk6Var.g0.setContentDescription(gk6Var.p().l(gk6Var.requireContext()));
            gk6Var.g0.setText(strE);
            gk6Var.j0.setEnabled(gk6Var.p().r());
        }
    }

    public static int q(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarD = f6b.d();
        calendarD.set(5, 1);
        Calendar calendarC = f6b.c(calendarD);
        calendarC.get(2);
        calendarC.get(1);
        int maximum = calendarC.getMaximum(7);
        calendarC.getActualMaximum(5);
        calendarC.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean r(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(bj6.d(context, rj6.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    @Override // androidx.fragment.app.e
    public final Dialog m() {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int iN = this.N;
        if (iN == 0) {
            iN = p().n(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, iN);
        Context context = dialog.getContext();
        this.V = r(context, android.R.attr.windowFullscreen);
        this.i0 = new kk6(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, bh8.n, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.i0.l(context);
        this.i0.p(ColorStateList.valueOf(color));
        this.i0.o(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.L.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.N = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.O = (wk2) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.Q = (a21) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.R = (am2) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.T = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.U = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.W = bundle.getInt("INPUT_MODE_KEY");
        this.X = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Y = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.Z = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.a0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.b0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.c0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.d0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.e0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.U;
        if (text == null) {
            text = requireContext().getResources().getText(this.T);
        }
        this.l0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.m0 = text;
    }

    @Override // androidx.fragment.app.f
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.V ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.V) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(q(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(q(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.g0 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.h0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.h0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.h0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, e00.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], e00.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.h0.setChecked(this.W != 0);
        egb.o(this.h0, null);
        CheckableImageButton checkableImageButton2 = this.h0;
        this.h0.setContentDescription(this.W == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        CheckableImageButton checkableImageButton3 = this.h0;
        pqa.a(this.h0, this.W == 1 ? checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
        this.h0.setOnClickListener(new View.OnClickListener() { // from class: ek6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gk6 gk6Var = this.t;
                gk6Var.j0.setEnabled(gk6Var.p().r());
                gk6Var.h0.toggle();
                int i = gk6Var.W == 1 ? 0 : 1;
                gk6Var.W = i;
                CheckableImageButton checkableImageButton4 = gk6Var.h0;
                gk6Var.h0.setContentDescription(i == 1 ? checkableImageButton4.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton4.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
                CheckableImageButton checkableImageButton5 = gk6Var.h0;
                pqa.a(gk6Var.h0, gk6Var.W == 1 ? checkableImageButton5.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode_tooltip) : checkableImageButton5.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode_tooltip));
                gk6Var.s();
            }
        });
        this.j0 = (Button) viewInflate.findViewById(R.id.confirm_button);
        boolean zR = p().r();
        Button button = this.j0;
        if (zR) {
            button.setEnabled(true);
        } else {
            button.setEnabled(false);
        }
        this.j0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.Y;
        if (charSequence != null) {
            this.j0.setText(charSequence);
        } else {
            int i = this.X;
            if (i != 0) {
                this.j0.setText(i);
            }
        }
        CharSequence charSequence2 = this.a0;
        if (charSequence2 != null) {
            this.j0.setContentDescription(charSequence2);
        } else if (this.Z != 0) {
            this.j0.setContentDescription(getContext().getResources().getText(this.Z));
        }
        this.j0.setOnClickListener(new View.OnClickListener() { // from class: ck6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gk6 gk6Var = this.t;
                Iterator it = gk6Var.J.iterator();
                while (it.hasNext()) {
                    ((ik6) it.next()).a(gk6Var.p().u());
                }
                gk6Var.k(false, false);
            }
        });
        Button button2 = (Button) viewInflate.findViewById(R.id.cancel_button);
        button2.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.c0;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i2 = this.b0;
            if (i2 != 0) {
                button2.setText(i2);
            }
        }
        CharSequence charSequence4 = this.e0;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.d0 != 0) {
            button2.setContentDescription(getContext().getResources().getText(this.d0));
        }
        button2.setOnClickListener(new View.OnClickListener() { // from class: dk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gk6 gk6Var = this.t;
                Iterator<View.OnClickListener> it = gk6Var.K.iterator();
                while (it.hasNext()) {
                    it.next().onClick(view);
                }
                gk6Var.k(false, false);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.N);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.O);
        a21 a21Var = this.Q;
        a21.b bVar = new a21.b();
        bVar.a = a21.b.f;
        bVar.b = a21.b.g;
        bVar.e = new al2(Long.MIN_VALUE);
        bVar.a = a21Var.t.y;
        bVar.b = a21Var.u.y;
        bVar.c = Long.valueOf(a21Var.w.y);
        bVar.d = a21Var.x;
        bVar.e = a21Var.v;
        rj6<S> rj6Var = this.S;
        by6 by6Var = rj6Var == null ? null : rj6Var.y;
        if (by6Var != null) {
            bVar.c = Long.valueOf(by6Var.y);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.R);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.T);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.U);
        bundle.putInt("INPUT_MODE_KEY", this.W);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.X);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.Y);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.Z);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.a0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.b0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.c0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.d0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.e0);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public final void onStart() {
        int iH;
        x10 anbVar;
        x10 anbVar2;
        super.onStart();
        Dialog dialog = this.E;
        if (dialog == null) {
            sp2.b(this, " does not have a Dialog.", "DialogFragment ");
            return;
        }
        Window window = dialog.getWindow();
        if (this.V) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.i0);
            if (!this.k0) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListA = f83.a(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListA != null ? Integer.valueOf(colorStateListA.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                Integer numB = g53.b(window.getContext(), android.R.attr.colorBackground);
                int iIntValue = numB != null ? numB.intValue() : -16777216;
                if (z2) {
                    numValueOf = Integer.valueOf(iIntValue);
                }
                jmb.a(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                if (i < 27) {
                    Integer numB2 = g53.b(context, android.R.attr.navigationBarColor);
                    iH = vi1.h(numB2 != null ? numB2.intValue() : -16777216, 128);
                } else {
                    iH = 0;
                }
                if (i < 35) {
                    window.setStatusBarColor(0);
                }
                if (i < 35) {
                    window.setNavigationBarColor(iH);
                }
                boolean z3 = g53.c(0) || g53.c(numValueOf.intValue());
                yv9 yv9Var = new yv9(window.getDecorView());
                if (i >= 35) {
                    anbVar = new dnb(window, yv9Var);
                } else if (i >= 30) {
                    anbVar = new bnb(window, yv9Var);
                } else {
                    anbVar = i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
                }
                anbVar.h(z3);
                boolean zC = g53.c(iIntValue);
                if (g53.c(iH) || (iH == 0 && zC)) {
                    z = true;
                }
                yv9 yv9Var2 = new yv9(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    anbVar2 = new dnb(window, yv9Var2);
                } else if (i2 >= 30) {
                    anbVar2 = new bnb(window, yv9Var2);
                } else {
                    anbVar2 = i2 >= 26 ? new anb(window, yv9Var2) : new zmb(window, yv9Var2);
                }
                anbVar2.g(z);
                fk6 fk6Var = new fk6(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap<View, fib> weakHashMap = egb.a;
                egb.d.c(viewFindViewById, fk6Var);
                this.k0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.i0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.E;
            if (dialog2 == null) {
                sp2.b(this, " does not have a Dialog.", "DialogFragment ");
                return;
            }
            decorView.setOnTouchListener(new wd5(dialog2, rect));
        }
        s();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.f
    public final void onStop() {
        this.P.t.clear();
        super.onStop();
    }

    public final wk2<S> p() {
        if (this.O == null) {
            this.O = (wk2) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.O;
    }

    public final void s() {
        Context contextRequireContext = requireContext();
        int iN = this.N;
        if (iN == 0) {
            iN = p().n(contextRequireContext);
        }
        String str = this.W == 1 ? "TEXT_INPUT_FRAGMENT_TAG" : "CALENDAR_FRAGMENT_TAG";
        f fVarE = getChildFragmentManager().E(str);
        yy7<S> yy7Var = fVarE instanceof yy7 ? (yy7) fVarE : null;
        if (yy7Var == null) {
            if (this.W == 1) {
                wk2<S> wk2VarP = p();
                a21 a21Var = this.Q;
                ok6 ok6Var = new ok6();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", iN);
                bundle.putParcelable("DATE_SELECTOR_KEY", wk2VarP);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", a21Var);
                ok6Var.setArguments(bundle);
                yy7Var = ok6Var;
            } else {
                wk2<S> wk2VarP2 = p();
                a21 a21Var2 = this.Q;
                am2 am2Var = this.R;
                rj6<S> rj6Var = new rj6<>();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", iN);
                bundle2.putParcelable("GRID_SELECTOR_KEY", wk2VarP2);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", a21Var2);
                bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", am2Var);
                bundle2.putParcelable("CURRENT_MONTH_KEY", a21Var2.w);
                rj6Var.setArguments(bundle2);
                this.S = rj6Var;
                yy7Var = rj6Var;
            }
        }
        this.P = yy7Var;
        yy7Var.i(new a());
        this.f0.setText((this.W == 1 && getResources().getConfiguration().orientation == 2) ? this.m0 : this.l0);
        String strE = p().e(getContext());
        this.g0.setContentDescription(p().l(requireContext()));
        this.g0.setText(strE);
        l childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        aVar.d(R.id.mtrl_calendar_frame, this.P, str, 2);
        aVar.i();
    }
}
