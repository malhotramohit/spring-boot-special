package swatispringboot.demoswati.restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import swatispringboot.demoswati.model.Wallet;

// localhost:8050/wallet/checkWallet
// web service 
// @controller : request handler
@RestController
@RequestMapping("/wallet")
public class WalletController {

	@Autowired
	private WalletDao walltetDao;

	// way 1 : @GetMapping
	@GetMapping("/checkWallet")
	public String status() {
		return "UP and Running";
	}

	// way 1:
	@GetMapping("/getWallet/{color}/{id}")
	public Wallet getWallet( @PathVariable("color") String color ,@PathVariable("id") long seq) {
		return (Wallet) walltetDao.getWallets().stream().filter(ob -> (ob.getSeq() == seq && ob.getColor().equals(color))).findAny().orElse(null);
	}

	// way2
	@RequestMapping(path = "/wallets", method = RequestMethod.GET)
	public List<Wallet> getWallets() {
		return walltetDao.getWallets();
	}

	@PostMapping("saveWallet")
	public void saveWallet(@RequestBody Wallet wallet) {
		walltetDao.getWallets().add(wallet);
	}

}
