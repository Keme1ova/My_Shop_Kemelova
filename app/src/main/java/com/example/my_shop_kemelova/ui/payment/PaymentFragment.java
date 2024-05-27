package com.example.my_shop_kemelova.ui.payment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.my_shop_kemelova.R;
import com.example.my_shop_kemelova.databinding.FragmentPaymentBinding;


public class PaymentFragment extends Fragment {

   FragmentPaymentBinding binding;
   NavController navController;

    public PaymentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPaymentBinding
                .inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cardVisa.setOnClickListener(v->{
            Intent myIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://visa.com/"));
            startActivity(myIntent);
        });
        binding.cardPayPal.setOnClickListener(v->{
            Intent myIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.paypal.com/"));
            startActivity(myIntent);
        });
        binding.cardMbank.setOnClickListener(v->{
            Intent myIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://mbank.kg/"));
            startActivity(myIntent);
        });
        binding.cardO.setOnClickListener(v->{
            Intent myIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://dengi.kg/?gad_source=1&gclid=Cj0KCQjw0ruyBhDuARIsANSZ3wq1tymIWO_MJksVAkyuTs7xjXAiK51FdHI_axTgPHKyONFKqkoSuUAaArp0EALw_wcB"));
            startActivity(myIntent);
        });

        binding.btnBack.setOnClickListener(v1 ->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_notifications_to_navigation_home);
                    
        });

    }
}