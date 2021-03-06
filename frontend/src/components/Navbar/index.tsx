import {ReactComponent as GithubIcon} from 'assests/img/github.svg'
import './styles.css'

function Navbar(){

    return(
        <header>
           <nav className="container">
               <div className="dsmovie-nav-content">
                   <h1>DsMovie</h1>
                   <a href="https://github.com/devsuperior">
                   <div className="dsmopvie-contact-container">
                        <GithubIcon />
                        <p className="dsmovie-contact-link">/devsuperior</p>
                    </div>
                   </a>
               </div>
           </nav>
        </header>

    );
}

export default Navbar;