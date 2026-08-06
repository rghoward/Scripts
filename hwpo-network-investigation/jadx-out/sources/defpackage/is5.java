package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class is5 implements wfb {
    public final View a;
    public final ImageView b;
    public final ConstraintLayout c;
    public final MaterialTextView d;
    public final ImageView e;
    public final ConstraintLayout f;
    public final RecyclerView g;
    public final RecyclerView h;
    public final MaterialTextView i;
    public final LinearLayoutCompat j;

    public is5(View view, ImageView imageView, ConstraintLayout constraintLayout, MaterialTextView materialTextView, ImageView imageView2, ConstraintLayout constraintLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialTextView materialTextView2, LinearLayoutCompat linearLayoutCompat) {
        this.a = view;
        this.b = imageView;
        this.c = constraintLayout;
        this.d = materialTextView;
        this.e = imageView2;
        this.f = constraintLayout2;
        this.g = recyclerView;
        this.h = recyclerView2;
        this.i = materialTextView2;
        this.j = linearLayoutCompat;
    }

    public static is5 bind(View view) {
        int i = R.id.buttonOpenLeaderboardDetails;
        ImageView imageView = (ImageView) nt3.b(R.id.buttonOpenLeaderboardDetails, view);
        if (imageView != null) {
            i = R.id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) nt3.b(R.id.container, view);
            if (constraintLayout != null) {
                i = R.id.description;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.description, view);
                if (materialTextView != null) {
                    i = R.id.descriptionFadeout;
                    ImageView imageView2 = (ImageView) nt3.b(R.id.descriptionFadeout, view);
                    if (imageView2 != null) {
                        i = R.id.expandContainer;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) nt3.b(R.id.expandContainer, view);
                        if (constraintLayout2 != null) {
                            i = R.id.fileAttachmentsList;
                            RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.fileAttachmentsList, view);
                            if (recyclerView != null) {
                                i = R.id.mediaAttachmentsList;
                                RecyclerView recyclerView2 = (RecyclerView) nt3.b(R.id.mediaAttachmentsList, view);
                                if (recyclerView2 != null) {
                                    i = R.id.performanceContentLayout;
                                    if (((LinearLayoutCompat) nt3.b(R.id.performanceContentLayout, view)) != null) {
                                        i = R.id.savePerformanceBtn;
                                        MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.savePerformanceBtn, view);
                                        if (materialTextView2 != null) {
                                            i = R.id.scoreDescriptionLayout;
                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.scoreDescriptionLayout, view);
                                            if (linearLayoutCompat != null) {
                                                i = R.id.scoringDetailsTitle;
                                                if (((MaterialTextView) nt3.b(R.id.scoringDetailsTitle, view)) != null) {
                                                    return new is5(view, imageView, constraintLayout, materialTextView, imageView2, constraintLayout2, recyclerView, recyclerView2, materialTextView2, linearLayoutCompat);
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

    public static is5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_score_info, viewGroup);
            return bind(viewGroup);
        }
        ac4.c("parent");
        return null;
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }
}
