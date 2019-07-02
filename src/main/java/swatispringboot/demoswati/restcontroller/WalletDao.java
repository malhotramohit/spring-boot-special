package swatispringboot.demoswati.restcontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import swatispringboot.demoswati.model.Wallet;

@Component
public class WalletDao {

	static List<Wallet> wallets;
	static {
		Wallet wallet = new Wallet(1, "Red", 35435.5);
		Wallet wallet1 = new Wallet(2, "Black", 35435.5);
		wallets = new ArrayList<>();
		wallets.add(wallet);
		wallets.add(wallet1);

	}

	public static List<Wallet> getWallets() {
		return wallets;
	}

	public static void setWallets(List<Wallet> wallets) {
		WalletDao.wallets = wallets;
	}

}
