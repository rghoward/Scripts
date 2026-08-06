package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vfb implements wfb {
    public final LinearLayout a;
    public final MaterialRadioButton b;
    public final RadioGroup c;
    public final MaterialRadioButton d;
    public final MaterialRadioButton e;
    public final MaterialRadioButton f;
    public final MaterialRadioButton g;
    public final MaterialRadioButton h;
    public final RadioGroup i;
    public final MaterialRadioButton j;
    public final RadioGroup k;
    public final MaterialRadioButton l;
    public final MaterialRadioButton m;
    public final MaterialRadioButton n;
    public final RadioGroup o;

    public vfb(LinearLayout linearLayout, MaterialRadioButton materialRadioButton, RadioGroup radioGroup, MaterialRadioButton materialRadioButton2, MaterialRadioButton materialRadioButton3, MaterialRadioButton materialRadioButton4, MaterialRadioButton materialRadioButton5, MaterialRadioButton materialRadioButton6, RadioGroup radioGroup2, MaterialRadioButton materialRadioButton7, RadioGroup radioGroup3, MaterialRadioButton materialRadioButton8, MaterialRadioButton materialRadioButton9, MaterialRadioButton materialRadioButton10, RadioGroup radioGroup4) {
        this.a = linearLayout;
        this.b = materialRadioButton;
        this.c = radioGroup;
        this.d = materialRadioButton2;
        this.e = materialRadioButton3;
        this.f = materialRadioButton4;
        this.g = materialRadioButton5;
        this.h = materialRadioButton6;
        this.i = radioGroup2;
        this.j = materialRadioButton7;
        this.k = radioGroup3;
        this.l = materialRadioButton8;
        this.m = materialRadioButton9;
        this.n = materialRadioButton10;
        this.o = radioGroup4;
    }

    public static vfb bind(View view) {
        int i = R.id.distance_meters_checkbox;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) nt3.b(R.id.distance_meters_checkbox, view);
        if (materialRadioButton != null) {
            i = R.id.distance_radio_group;
            RadioGroup radioGroup = (RadioGroup) nt3.b(R.id.distance_radio_group, view);
            if (radioGroup != null) {
                i = R.id.distance_yards_checkbox;
                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) nt3.b(R.id.distance_yards_checkbox, view);
                if (materialRadioButton2 != null) {
                    i = R.id.english_language_checkbox;
                    MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) nt3.b(R.id.english_language_checkbox, view);
                    if (materialRadioButton3 != null) {
                        i = R.id.espanol_language_checkbox;
                        MaterialRadioButton materialRadioButton4 = (MaterialRadioButton) nt3.b(R.id.espanol_language_checkbox, view);
                        if (materialRadioButton4 != null) {
                            i = R.id.female_gender_checkbox;
                            MaterialRadioButton materialRadioButton5 = (MaterialRadioButton) nt3.b(R.id.female_gender_checkbox, view);
                            if (materialRadioButton5 != null) {
                                i = R.id.francais_language_checkbox;
                                MaterialRadioButton materialRadioButton6 = (MaterialRadioButton) nt3.b(R.id.francais_language_checkbox, view);
                                if (materialRadioButton6 != null) {
                                    i = R.id.genders_radio_group;
                                    RadioGroup radioGroup2 = (RadioGroup) nt3.b(R.id.genders_radio_group, view);
                                    if (radioGroup2 != null) {
                                        i = R.id.kg_weight_checkbox;
                                        MaterialRadioButton materialRadioButton7 = (MaterialRadioButton) nt3.b(R.id.kg_weight_checkbox, view);
                                        if (materialRadioButton7 != null) {
                                            i = R.id.languages_radio_group;
                                            RadioGroup radioGroup3 = (RadioGroup) nt3.b(R.id.languages_radio_group, view);
                                            if (radioGroup3 != null) {
                                                i = R.id.male_gender_checkbox;
                                                MaterialRadioButton materialRadioButton8 = (MaterialRadioButton) nt3.b(R.id.male_gender_checkbox, view);
                                                if (materialRadioButton8 != null) {
                                                    i = R.id.other_gender__checkbox;
                                                    MaterialRadioButton materialRadioButton9 = (MaterialRadioButton) nt3.b(R.id.other_gender__checkbox, view);
                                                    if (materialRadioButton9 != null) {
                                                        i = R.id.pound_weight_checkbox;
                                                        MaterialRadioButton materialRadioButton10 = (MaterialRadioButton) nt3.b(R.id.pound_weight_checkbox, view);
                                                        if (materialRadioButton10 != null) {
                                                            i = R.id.weight_radio_group;
                                                            RadioGroup radioGroup4 = (RadioGroup) nt3.b(R.id.weight_radio_group, view);
                                                            if (radioGroup4 != null) {
                                                                return new vfb((LinearLayout) view, materialRadioButton, radioGroup, materialRadioButton2, materialRadioButton3, materialRadioButton4, materialRadioButton5, materialRadioButton6, radioGroup2, materialRadioButton7, radioGroup3, materialRadioButton8, materialRadioButton9, materialRadioButton10, radioGroup4);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static vfb inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_account_setings, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static vfb inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
