package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.intercom.twig.BuildConfig;
import defpackage.gpa;
import defpackage.ph8;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    public ImageView A;
    public LinearLayout B;
    public final Drawable C;
    public final int D;
    public final Context E;
    public boolean F;
    public final Drawable G;
    public final boolean H;
    public LayoutInflater I;
    public boolean J;
    public h t;
    public ImageView u;
    public RadioButton v;
    public TextView w;
    public CheckBox x;
    public TextView y;
    public ImageView z;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        gpa gpaVarE = gpa.e(getContext(), attributeSet, ph8.r, i);
        this.C = gpaVarE.b(5);
        TypedArray typedArray = gpaVarE.b;
        this.D = typedArray.getResourceId(1, -1);
        this.F = typedArray.getBoolean(7, false);
        this.E = context;
        this.G = gpaVarE.b(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.hwpo_training_app.R.attr.dropDownListViewStyle, 0);
        this.H = typedArrayObtainStyledAttributes.hasValue(0);
        gpaVarE.f();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.I == null) {
            this.I = LayoutInflater.from(getContext());
        }
        return this.I;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.z;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A.getLayoutParams();
        rect.top = this.A.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        boolean z;
        int i;
        String string;
        this.t = hVar;
        boolean zIsVisible = hVar.isVisible();
        f fVar = hVar.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(hVar.e);
        setCheckable(hVar.isCheckable());
        if (fVar.o()) {
            if ((fVar.n() ? hVar.j : hVar.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        fVar.n();
        if (z) {
            h hVar2 = this.t;
            f fVar2 = hVar2.n;
            if (fVar2.o()) {
                i = (fVar2.n() ? hVar2.j : hVar2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.y;
            h hVar3 = this.t;
            f fVar3 = hVar3.n;
            Context context = fVar3.a;
            char c = fVar3.n() ? hVar3.j : hVar3.h;
            if (c == 0) {
                string = BuildConfig.FLAVOR;
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.hwpo_training_app.R.string.abc_prepend_shortcut_label));
                }
                int i2 = fVar3.n() ? hVar3.k : hVar3.i;
                h.c(i2, 65536, resources.getString(com.hwpo_training_app.R.string.abc_menu_meta_shortcut_label), sb);
                h.c(i2, 4096, resources.getString(com.hwpo_training_app.R.string.abc_menu_ctrl_shortcut_label), sb);
                h.c(i2, 2, resources.getString(com.hwpo_training_app.R.string.abc_menu_alt_shortcut_label), sb);
                h.c(i2, 1, resources.getString(com.hwpo_training_app.R.string.abc_menu_shift_shortcut_label), sb);
                h.c(i2, 4, resources.getString(com.hwpo_training_app.R.string.abc_menu_sym_shortcut_label), sb);
                h.c(i2, 8, resources.getString(com.hwpo_training_app.R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(com.hwpo_training_app.R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(com.hwpo_training_app.R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(com.hwpo_training_app.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.y.getVisibility() != i) {
            this.y.setVisibility(i);
        }
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.q);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.t;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.C);
        TextView textView = (TextView) findViewById(com.hwpo_training_app.R.id.title);
        this.w = textView;
        int i = this.D;
        if (i != -1) {
            textView.setTextAppearance(this.E, i);
        }
        this.y = (TextView) findViewById(com.hwpo_training_app.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.hwpo_training_app.R.id.submenuarrow);
        this.z = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.G);
        }
        this.A = (ImageView) findViewById(com.hwpo_training_app.R.id.group_divider);
        this.B = (LinearLayout) findViewById(com.hwpo_training_app.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.u != null && this.F) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.u.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.v == null && this.x == null) {
            return;
        }
        if ((this.t.x & 4) != 0) {
            if (this.v == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.hwpo_training_app.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.v = radioButton;
                LinearLayout linearLayout = this.B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.v;
            view = this.x;
        } else {
            if (this.x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.hwpo_training_app.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.x = checkBox;
                LinearLayout linearLayout2 = this.B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.x;
            view = this.v;
        }
        if (z) {
            compoundButton.setChecked(this.t.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.x;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.v;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.t.x & 4) != 0) {
            if (this.v == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.hwpo_training_app.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.v = radioButton;
                LinearLayout linearLayout = this.B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.v;
        } else {
            if (this.x == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.hwpo_training_app.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.x = checkBox;
                LinearLayout linearLayout2 = this.B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.x;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.J = z;
        this.F = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setVisibility((this.H || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        f fVar = this.t.n;
        boolean z = this.J;
        if (z || this.F) {
            ImageView imageView = this.u;
            if (imageView == null && drawable == null && !this.F) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.hwpo_training_app.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.u = imageView2;
                LinearLayout linearLayout = this.B;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.F) {
                this.u.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.u;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.u.getVisibility() != 0) {
                this.u.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.w;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.w.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.w.getVisibility() != 0) {
                this.w.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.hwpo_training_app.R.attr.listMenuViewStyle);
    }
}
